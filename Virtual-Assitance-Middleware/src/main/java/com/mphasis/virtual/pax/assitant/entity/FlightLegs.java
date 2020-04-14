package com.mphasis.virtual.pax.assitant.entity;

public class FlightLegs {

	private String datel;
	private String deptime;
	private String airline;
	private String flightno;
	private String brdl;
	private String offl;
	private String arrtime;
	private String traveltime;
	public FlightLegs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightLegs(String datel, String deptime, String airline, String flightno, String brdl, String offl,
			String arrtime, String traveltime) {
		super();
		this.datel = datel;
		this.deptime = deptime;
		this.airline = airline;
		this.flightno = flightno;
		this.brdl = brdl;
		this.offl = offl;
		this.arrtime = arrtime;
		this.traveltime = traveltime;
	}
	public String getDatel() {
		return datel;
	}
	public void setDatel(String datel) {
		this.datel = datel;
	}
	public String getDeptime() {
		return deptime;
	}
	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	public String getBrdl() {
		return brdl;
	}
	public void setBrdl(String brdl) {
		this.brdl = brdl;
	}
	public String getOffl() {
		return offl;
	}
	public void setOffl(String offl) {
		this.offl = offl;
	}
	public String getArrtime() {
		return arrtime;
	}
	public void setArrtime(String arrtime) {
		this.arrtime = arrtime;
	}
	public String getTraveltime() {
		return traveltime;
	}
	public void setTraveltime(String traveltime) {
		this.traveltime = traveltime;
	}
	@Override
	public String toString() {
		return "FlightLegs [datel=" + datel + ", deptime=" + deptime + ", airline=" + airline + ", flightno=" + flightno
				+ ", brdl=" + brdl + ", offl=" + offl + ", arrtime=" + arrtime + ", traveltime=" + traveltime + "]";
	}
	
}
