package controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.Code;
import model.TrainDetails;

public class ListTrains extends Thread {

	static String to=Code.getCode1();
	static String from=Code.getCode2();
	String date;
	StringBuilder sb=new StringBuilder();
	String s;
	String[][] table;
	static ArrayList<TrainDetails> ar=new ArrayList<TrainDetails>();
	
	public ListTrains(String s) {
		this.date=s;
	}
	public String[][] setRequest() {
		try {
		URL url=new URL("https://api.railwayapi.com/v2/between/source/"+from+"/dest/"+to+"/date/"+date+"/apikey/44g3be9pt8/");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		int responsecode=connection.getResponseCode();
		System.out.println(responsecode);
		if(responsecode==200) {
		    Scanner sc=new Scanner(url.openStream());
		    while(sc.hasNext()) {
		    	String r=sc.nextLine();
		    	sb.append(r);
		    }
		    String sr=sb.toString();
		    JSONParser jp=new JSONParser();
			JSONObject j=(JSONObject)jp.parse(sr);
			JSONArray trains=(JSONArray) j.get("trains");
			for(int i=0;i<trains.size();i++) {
				JSONObject index=(JSONObject) trains.get(i);
				String number=index.get("number").toString();
				String name=index.get("name").toString();
				String deptime=index.get("src_departure_time").toString();
				String arivaltime=index.get("dest_arrival_time").toString();
				ar.add(new TrainDetails(name,number,deptime,arivaltime));
				
			}
			table=new String[ar.size()][4];
			int i=0;
			for(TrainDetails t:ar) {
				table[i][0]=t.getName();
				table[i][1]=t.getNumber();
				table[i][2]=t.getDeptime();
				table[i][3]=t.getArivaltime();
				i++;
			}
	
     }
		}catch (MalformedURLException e) {
	e.printStackTrace();
       }  
     catch (IOException e) {
	e.printStackTrace();
     }
     catch (ParseException e) {
	e.printStackTrace();

    }
   return table;
	}
	
	}
	

