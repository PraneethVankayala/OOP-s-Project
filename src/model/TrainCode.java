package model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import views.Train;

public class TrainCode extends Thread {
	
	String name;
    private String s;
 

StringBuilder sb=new StringBuilder();
 
   public TrainCode(String name) {
	 this.name=name;
   }
   Code c=new Code();
   public String setRequest() {
	   try {
			URL url=new URL("https://api.railwayapi.com/v2/name-to-code/station/"+name+"/apikey/44g3be9pt8/");
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				
				int responsecode=connection.getResponseCode();
				
				if(responsecode==200) {
				    Scanner sc=new Scanner(url.openStream());
				    while(sc.hasNext()) {
				    	String r=sc.nextLine();
				    	sb.append(r);
				    }
				    String sr=sb.toString();
				    JSONParser jp=new JSONParser();
					JSONObject j=(JSONObject)jp.parse(sr);
					JSONArray ja=(JSONArray) j.get("stations");
					for(int i=0;i<ja.size();i++) {
						JSONObject index=(JSONObject) ja.get(i);
						String nm=index.get("name").toString();
						if(nm.contains(name)) {
							s=index.get("code").toString();
							}
					}
				   c.setCode1(s.toString());
				   setS(s);
				}
		
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		
	}
	   return s;
   }
	
   public void run() {
	   String s=setRequest();
   }
    
	public void setS(String s) {
		this.s = s;
	}
	public String getS() {
		
		return s;
	}
	
	
}
