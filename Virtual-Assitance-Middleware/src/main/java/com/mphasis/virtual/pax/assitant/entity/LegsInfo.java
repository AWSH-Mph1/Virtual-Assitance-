package com.mphasis.virtual.pax.assitant.entity;

public class LegsInfo {
	
	private String depStaion;
	private String arrivalStation;
	private String date;
	private String arrivalTime;
	private String depTime;
	private String flightNo;
	private String airlineName;
	private String travelTime;
	
	public LegsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LegsInfo(String depStaion, String arrivalStation, String date, String arrivalTime, String depTime,
			String flightNo, String airlineName, String travelTime) {
		super();
		this.depStaion = depStaion;
		this.arrivalStation = arrivalStation;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.depTime = depTime;
		this.flightNo = flightNo;
		this.airlineName = airlineName;
		this.travelTime = travelTime;
	}

	public String getDepStaion() {
		return depStaion;
	}

	public void setDepStaion(String depStaion) {
		this.depStaion = depStaion;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	@Override
	public String toString() {
		return "LegsInfo [depStaion=" + depStaion + ", arrivalStation=" + arrivalStation + ", date=" + date
				+ ", arrivalTime=" + arrivalTime + ", depTime=" + depTime + ", flightNo=" + flightNo + ", airlineName="
				+ airlineName + ", travelTime=" + travelTime + "]";
	}
	
}
