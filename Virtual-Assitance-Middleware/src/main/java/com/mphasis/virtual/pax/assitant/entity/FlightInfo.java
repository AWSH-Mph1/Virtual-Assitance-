package com.mphasis.virtual.pax.assitant.entity;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "FlightsInfo")
public class FlightInfo {
	
	private String borading;
	private String off;

	FlightInfoKey flightInfoKey;

	List<LegsInfo> legsInfo;
	
	public FlightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightInfo(String borading, String off, FlightInfoKey flightInfoKey, List<LegsInfo> legsInfo) {
		super();
		this.borading = borading;
		this.off = off;
		this.flightInfoKey = flightInfoKey;
		this.legsInfo = legsInfo;
	}

	public String getBorading() {
		return borading;
	}

	public void setBorading(String borading) {
		this.borading = borading;
	}

	public String getOff() {
		return off;
	}

	public void setOff(String off) {
		this.off = off;
	}

	public FlightInfoKey getFlightInfoKey() {
		return flightInfoKey;
	}

	public void setFlightInfoKey(FlightInfoKey flightInfoKey) {
		this.flightInfoKey = flightInfoKey;
	}

	public List<LegsInfo> getLegsInfo() {
		return legsInfo;
	}

	public void setLegsInfo(List<LegsInfo> legsInfo) {
		this.legsInfo = legsInfo;
	}

	@Override
	public String toString() {
		return "FlightInfo [borading=" + borading + ", off=" + off + ", flightInfoKey=" + flightInfoKey + ", legsInfo="
				+ legsInfo + "]";
	}
	
	
}
