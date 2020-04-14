package com.mphasis.virtual.pax.assitant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mphasis.virtual.pax.assitant.entity.FlightAvalibility;
import com.mphasis.virtual.pax.assitant.entity.FlightAvalibilityInfo;
import com.mphasis.virtual.pax.assitant.entity.FlightInfo;
import com.mphasis.virtual.pax.assitant.entity.FlightInfoKey;
import com.mphasis.virtual.pax.assitant.entity.LegsInfo;
import com.mphasis.virtual.pax.assitant.entity.PassportInfo;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;


@Service
public class Dbservice {

		
	@Autowired
	AmazonDynamoDB dynamoDbclient;

	public void saveImageDetails(PassportInfo passportInfo) {
		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDbclient);
		try {
		System.out.println("in DB service Save :  "+passportInfo.toString());
		mapper.save(passportInfo);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PassportInfo getImageDetails(String id) {
		
		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDbclient);
		PassportInfo passportInfo = mapper.load(PassportInfo.class, id);
        System.out.println("Item retrieved:");
        System.out.println(passportInfo);
        
        return passportInfo;
	}
	
//	public void createTable() {
//		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDbclient);
//	 CreateTableRequest req = mapper.generateCreateTableRequest(FlightInfo.class);
//	 // Table provision throughput is still required since it cannot be specified in your POJO
//	 req.setProvisionedThroughput(new ProvisionedThroughput(5L, 5L));
//	 // Fire off the CreateTableRequest using the low-level client
//	 dynamoDbclient.createTable(req);
//	}
	
	
	public FlightInfo getFlightInfo(String boarding, String off) {
		FlightInfo info=new FlightInfo();
		DynamoDB dynamoDB = new DynamoDB(dynamoDbclient);
        Table table = dynamoDB.getTable("FlightData");
        GetItemSpec spec = new GetItemSpec().withPrimaryKey("borading",boarding , "off", off);

        try {
            Item outcome = table.getItem(spec);           
            FlightInfoKey infoKey;
            
            final ObjectMapper mapper = new ObjectMapper(); 
            infoKey = mapper.convertValue(outcome.getMap("flightInfoKey"), FlightInfoKey.class);
            
            List<LegsInfo> listLegs=outcome.getList("legsInfo");        
            info.setBorading(boarding);
            info.setOff(off);
            info.setFlightInfoKey(infoKey);
            info.setLegsInfo(listLegs);
        }
        catch (Exception e) {
            System.err.println("Unable to read item: " + boarding + " " + off);
            System.err.println(e.getMessage());
        }
		return info;	
	}

	public FlightAvalibility getAvaliblefightInfo(String boarding, String off) {
		
		FlightAvalibility info=new FlightAvalibility();
		DynamoDB dynamoDB = new DynamoDB(dynamoDbclient);
        Table table = dynamoDB.getTable("FlightAvalibility");
        GetItemSpec spec = new GetItemSpec().withPrimaryKey("borading",boarding, "off", off);
		
        
        try {
            Item outcome = table.getItem(spec);           
            FlightAvalibilityInfo infoKey;
            
            final ObjectMapper mapper = new ObjectMapper(); 
            infoKey = mapper.convertValue(outcome.getMap("flightInfoKey"), FlightAvalibilityInfo.class);
            
            List<FlightAvalibilityInfo> listLegs=outcome.getList("flightAvalibilityInfo");        
            info.setBorading(boarding);
            info.setOff(off);
            info.setFlightAvalibilityInfo(listLegs);
        }
        catch (Exception e) {
            System.err.println("Unable to read item: " + boarding + " " + off);
            System.err.println(e.getMessage());
        }
		
		return info;
	}
	
}
