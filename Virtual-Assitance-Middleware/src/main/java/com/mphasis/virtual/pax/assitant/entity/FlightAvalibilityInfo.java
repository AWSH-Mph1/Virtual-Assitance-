package com.mphasis.virtual.pax.assitant.entity;

import java.util.List;

public class FlightAvalibilityInfo {

	private String brd;
	private String off;
	private String date;
	private String cost;
	private String option;
	private String legsCount;
	private String delayPredict;
	private String delayCI;
	private String transit;
	
	List<FlightLegs> flightLegs;

	public FlightAvalibilityInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightAvalibilityInfo(String brd, String off, String date, String cost, String option, String legsCount,
			String delayPredict, String delayCI, String transit, List<FlightLegs> flightLegs) {
		super();
		this.brd = brd;
		this.off = off;
		this.date = date;
		this.cost = cost;
		this.option = option;
		this.legsCount = legsCount;
		this.delayPredict = delayPredict;
		this.delayCI = delayCI;
		this.transit = transit;
		this.flightLegs = flightLegs;
	}

	public String getBrd() {
		return brd;
	}

	public void setBrd(String brd) {
		this.brd = brd;
	}

	public String getOff() {
		return off;
	}

	public void setOff(String off) {
		this.off = off;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getLegsCount() {
		return legsCount;
	}

	public void setLegsCount(String legsCount) {
		this.legsCount = legsCount;
	}

	public String getDelayPredict() {
		return delayPredict;
	}

	public void setDelayPredict(String delayPredict) {
		this.delayPredict = delayPredict;
	}

	public String getDelayCI() {
		return delayCI;
	}

	public void setDelayCI(String delayCI) {
		this.delayCI = delayCI;
	}

	public String getTransit() {
		return transit;
	}

	public void setTransit(String transit) {
		this.transit = transit;
	}

	public List<FlightLegs> getFlightLegs() {
		return flightLegs;
	}

	public void setFlightLegs(List<FlightLegs> flightLegs) {
		this.flightLegs = flightLegs;
	}

	@Override
	public String toString() {
		return "FlightAvalibilityInfo [brd=" + brd + ", off=" + off + ", date=" + date + ", cost=" + cost + ", option="
				+ option + ", legsCount=" + legsCount + ", delayPredict=" + delayPredict + ", delayCI=" + delayCI
				+ ", transit=" + transit + ", flightLegs=" + flightLegs + "]";
	}
}
