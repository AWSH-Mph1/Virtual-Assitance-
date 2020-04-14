package com.mphasis.virtual.pax.assitant.entity;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "FlightAvalibility")
public class FlightAvalibility {
	
	private String borading;
	private String off;
	
	List<FlightAvalibilityInfo> flightAvalibilityInfo;

	public FlightAvalibility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightAvalibility(String borading, String off, List<FlightAvalibilityInfo> flightAvalibilityInfo) {
		super();
		this.borading = borading;
		this.off = off;
		this.flightAvalibilityInfo = flightAvalibilityInfo;
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

	public List<FlightAvalibilityInfo> getFlightAvalibilityInfo() {
		return flightAvalibilityInfo;
	}

	public void setFlightAvalibilityInfo(List<FlightAvalibilityInfo> flightAvalibilityInfo) {
		this.flightAvalibilityInfo = flightAvalibilityInfo;
	}

}
