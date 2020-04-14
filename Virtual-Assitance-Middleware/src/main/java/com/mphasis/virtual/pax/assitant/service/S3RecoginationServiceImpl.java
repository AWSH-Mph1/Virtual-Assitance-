package com.mphasis.virtual.pax.assitant.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.model.AmazonRekognitionException;
import com.amazonaws.services.rekognition.model.DetectTextRequest;
import com.amazonaws.services.rekognition.model.DetectTextResult;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.rekognition.model.TextDetection;
import com.mphasis.virtual.pax.assitant.entity.PassportInfo;

@Service
public class S3RecoginationServiceImpl {

	@Autowired
	private AmazonRekognition rekognitionClient;
	
	@Autowired
	Dbservice service;
	
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public void getImageDetails(String bucket, String photo) {		

	      DetectTextRequest request = new DetectTextRequest().withImage(new Image().withS3Object(new S3Object().withName(photo).withBucket(bucket)));	      
	      try {
	          DetectTextResult result = rekognitionClient.detectText(request);
	          List<TextDetection> textDetections = result.getTextDetections();
	          PassportInfo passportInfo=new PassportInfo();
	          System.out.println("Detected lines and words for " + photo);
	          for (TextDetection text: textDetections) {        	  	
	        	  	
//	        			if(text.getId()==5) {		
//	        				passportInfo.setSurname(text.getDetectedText());	
//	        			}
//	        			if(text.getId()==7) {
//	        				passportInfo.setName(text.getDetectedText());	
//	        			}
//	        			if(text.getId()==32) {
//	        				passportInfo.setPassportnumber(Integer.parseInt(text.getDetectedText()));
//	        			}
//	        			if(text.getId()==9) {
//	        				passportInfo.setNationality(text.getDetectedText());
//	        			}
//	        			if(text.getId()==11) {
//	        				passportInfo.setDateofBirth(text.getDetectedText());
//	        			}
//	  	  
	                  System.out.println("Detected: " + text.getDetectedText());
	                  System.out.println("Confidence: " + text.getConfidence().toString());
	                  System.out.println("Id : " + text.getId());
	                  System.out.println("Parent Id: " + text.getParentId());
	                  System.out.println("Type: " + text.getType());
	                  System.out.println();
	        			
	          }
	          passportInfo.setId(String.valueOf(count.incrementAndGet()));
	          System.out.println(" Passport Info : : "+passportInfo.toString());
//	          service.saveImageDetails(passportInfo);
	       } catch(AmazonRekognitionException e) {
	          e.printStackTrace();
	       }
	    }
	
}
