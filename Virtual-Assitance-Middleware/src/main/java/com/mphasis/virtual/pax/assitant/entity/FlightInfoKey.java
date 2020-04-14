package com.mphasis.virtual.pax.assitant.entity;

public class FlightInfoKey {

	private String date;
	private String cost;
	private int opt;
	private int legsNum;
	
	public FlightInfoKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightInfoKey(String date, String cost, int opt, int legsNum) {
		super();
		this.date = date;
		this.cost = cost;
		this.opt = opt;
		this.legsNum = legsNum;
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

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
	}

	public int getLegsNum() {
		return legsNum;
	}

	public void setLegsNum(int legsNum) {
		this.legsNum = legsNum;
	}

	@Override
	public String toString() {
		return "FlightInfoKey [date=" + date + ", cost=" + cost + ", opt=" + opt + ", legsNum=" + legsNum + "]";
	}
	
	
}
