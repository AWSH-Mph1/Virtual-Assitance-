package com.mphasis.virtual.pax.assitant.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass test=new TestClass();
		
		FlightAvalibility flightinfo=new FlightAvalibility();
		
		flightinfo=test.getFlightInfoData(flightinfo);
		
		ObjectMapper Obj = new ObjectMapper();
		
		try {
			String str=Obj.writeValueAsString(flightinfo);
			System.out.println(" Str : : "+str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	   public FlightInfo getFlightInfoData(FlightInfo info) 
//	    { 
//		   
//		   info.setBorading("BOM");
//		   info.setOff("TPA");
//		   
//		   FlightInfoKey infoKey=new FlightInfoKey("12-MAY","$1300", 1, 3);
//		   info.setFlightInfoKey(infoKey);
//		   
//		   List legList = new ArrayList<>();
//		   LegsInfo legsinfo=new LegsInfo("BOM", "IST", "12-MAY","", "6:30:00 AM", "TK-721", "Turkish","6h 45m");
//		   LegsInfo legsinfo1=new LegsInfo("IST", "JFK", "12-MAY","", "1:30:00 PM", "TK-1", "Turkish","10h 50m");
//		   LegsInfo legsinfo2=new LegsInfo("JFK", "TPA", "13-MAY","", "1:33:00 PM", "B6-325", "Jet-Blue","2h 55m");
//		   legList.add(legsinfo);
//		   legList.add(legsinfo1);
//		   legList.add(legsinfo2);		   
//		   info.setLegsInfo(legList);
//	        
//	  
//	        // Return the object 
//	        return info; 
//	    } 
	
	   public FlightAvalibility getFlightInfoData(FlightAvalibility info) 
    { 
	   

	   
	   FlightLegs legsList0=new FlightLegs("12-MAY", "6:30:00", "Turkish", "721", "BOM", "IST", "1045", "6h 45m");
	   FlightLegs legsList1=new FlightLegs("12-MAY", "13:30:00", "Turkish", "11", "IST", "JFK", "1720", "10h 50m");
	   FlightLegs legsList2=new FlightLegs("12-MAY", "13:33:00", "JetBlue", "325", "JFK", "TPA", "2317", "2h 55m");
	   
	   List<FlightLegs> listLegs = new ArrayList<>();
	   
	   listLegs.add(legsList0);
	   listLegs.add(legsList1);
	   listLegs.add(legsList2);
	   
	   
	   FlightLegs legsList3=new FlightLegs("12-MAY", "6:30:00", "Turkish", "721", "BOM", "IST", "1045", "6h 45m");
	   FlightLegs legsList4=new FlightLegs("12-MAY", "18:35:00", "Turkish", "11", "IST", "JFK", "2230", "10h 55m");
	   FlightLegs legsList5=new FlightLegs("13-MAY", "13:33:00", "JetBlue", "325", "JFK", "TPA", "2317", "2h 55m");
	   
	   List<FlightLegs> listLegs1 = new ArrayList<>();
	   
	   listLegs1.add(legsList3);
	   listLegs1.add(legsList4);
	   listLegs1.add(legsList5);
	   
	   FlightLegs legsList6=new FlightLegs("12-MAY", "6:30:00", "Turkish", "721", "BOM", "IST", "1045", "6h 45m");
	   FlightLegs legsList7=new FlightLegs("12-MAY", "17:00:00", "Turkish", "3", "IST", "JFK", "2250", "10h 50m");
	   FlightLegs legsList8=new FlightLegs("13-MAY", "13:33:00", "JetBlue", "325", "JFK", "TPA", "2317", "2h 55m");
	   
	   List<FlightLegs> listLegs2 = new ArrayList<>();
	   
	   listLegs2.add(legsList6);
	   listLegs2.add(legsList7);
	   listLegs2.add(legsList8);
	   
	   
	   FlightLegs legsList9=new FlightLegs("12-MAY", "1:55:00", "BA", "138", "BOM", "LGW", "0655", "9h 40m");
	   FlightLegs legsList10=new FlightLegs("12-MAY", "17:00:00", "BA", "2167", "LGW", "TPA", "1825", "9h 30m");
//	   FlightLegs legsList11=new FlightLegs("13-MAY", "13:33:00", "JetBlue", "325", "JFK", "TPA", "2317", "2h 55m");
	   
	   List<FlightLegs> listLegs3 = new ArrayList<>();
	   
	   listLegs3.add(legsList9);
	   listLegs3.add(legsList10);
//	   listLegs3.add(legsList11);
	   
	   
	   FlightAvalibilityInfo infoKey=new FlightAvalibilityInfo("BOM","TPA","12-MAY","$1300", "1","3","0","0.72","0", listLegs);
	   FlightAvalibilityInfo infoKey1=new FlightAvalibilityInfo("BOM","TPA","12-MAY","$1400", "2","3","0","0.68","0", listLegs1);
	   FlightAvalibilityInfo infoKey2=new FlightAvalibilityInfo("BOM","TPA","12-MAY","$1550", "3","3","1","0.61","0", listLegs2);
	   FlightAvalibilityInfo infoKey3=new FlightAvalibilityInfo("BOM","TPA","12-MAY","$0960", "4","2","0","0.75","1", listLegs3);
	   
	   List<FlightAvalibilityInfo> flightAvalibilityList = new ArrayList<>();
	   
	   flightAvalibilityList.add(infoKey);
	   flightAvalibilityList.add(infoKey1);
	   flightAvalibilityList.add(infoKey2);
	   flightAvalibilityList.add(infoKey3);
	   
	   
	   info.setBorading("BOM");
	   info.setOff("TPA");
	   info.setFlightAvalibilityInfo(flightAvalibilityList);
	   
//	   List legList = new ArrayList<>();
//	   LegsInfo legsinfo=new LegsInfo("BOM", "IST", "12-MAY","", "6:30:00 AM", "TK-721", "Turkish","6h 45m");
//	   LegsInfo legsinfo1=new LegsInfo("IST", "JFK", "12-MAY","", "1:30:00 PM", "TK-1", "Turkish","10h 50m");
//	   LegsInfo legsinfo2=new LegsInfo("JFK", "TPA", "13-MAY","", "1:33:00 PM", "B6-325", "Jet-Blue","2h 55m");
//	   legList.add(legsinfo);
//	   legList.add(legsinfo1);
//	   legList.add(legsinfo2);		   
//	   info.setLegsInfo(legList);

  
        // Return the object 
        return info; 
    } 
	

}
