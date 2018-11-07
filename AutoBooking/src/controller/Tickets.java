package controller;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.LoginModel;
public class Tickets {
	

	public  void add(String from,String to,String date,String seats,String train) {
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket", "bunny","amma1435");
			Statement s=conn.createStatement();
			
			String update="INSERT INTO tickets (fro,t,doj,seats,travel,type,username) VALUES('"+from+"','"+to+"','"+date+"','"+seats+"','"+train+"','Train','"+LoginModel.getUsername()+"');";
			int cnt=s.executeUpdate(update);
			System.out.println(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public  void add1(String from,String to,String date,String seats,String train) {
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket", "bunny","amma1435");
			Statement s=conn.createStatement();
			
			String update="INSERT INTO tickets (fro,t,doj,seats,travel,type,username) VALUES('"+from+"','"+to+"','"+date+"','"+seats+"','"+train+"','Bus','"+LoginModel.getUsername()+"');";
			int cnt=s.executeUpdate(update);
			System.out.println(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String[][] myTickets(){
		String[][] data = null;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket", "bunny","amma1435");
			Statement s=conn.createStatement();
			
			String update="SELECT * FROM tickets WHERE username='"+LoginModel.getUsername()+"'";
			ResultSet set=s.executeQuery(update);
			set.last(); 
			int total = set.getRow();
			System.out.println(total);
            set.beforeFirst();
			int i=0;
			data=new String[total][7];
			while(set.next()) {
				int id=set.getInt("id");
				String ids=String.valueOf(id);
				String from=set.getString("fro");
				String to=set.getString("t");
				String date=set.getString("doj");
				String seats=set.getString("seats");
				String trainno=set.getString("travel");
				String type=set.getString("type");
				data[i][0]=type;
				data[i][1]=ids;
				data[i][2]=from;
				data[i][3]=to;
				data[i][4]=date;
				data[i][5]=seats;
				data[i][6]=trainno;
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	public String[][] CancelTicket(){
		String[][] data = null;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket", "bunny","amma1435");
			Statement s=conn.createStatement();
			DateFormat d=new SimpleDateFormat("dd");
			Date daten=new Date();
			int lo=Integer.parseInt(d.format(daten));
			String update="SELECT * FROM tickets WHERE username='"+LoginModel.getUsername()+"'";
			ResultSet set=s.executeQuery(update);
			set.last(); 
			int total = set.getRow();
            set.beforeFirst();
			int i=0;
			data=new String[total][7];
			while(set.next()) {
				int id=set.getInt("id");
				String ids=String.valueOf(id);
				String from=set.getString("fro");
				String to=set.getString("t");
				String date=set.getString("doj");
				String seats=set.getString("seats");
				String trainno=set.getString("travel");
				String type=set.getString("type");
				String[] dat=date.split("-");
				int da=Integer.parseInt(dat[0]);
				if(da>=lo) {
				data[i][0]=type;
				data[i][1]=ids;
				data[i][2]=from;
				data[i][3]=to;
				data[i][4]=date;
				data[i][5]=seats;
				data[i][6]=trainno;
				}
				i++;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	public void CancelTickets(String trainno){
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticket", "bunny","amma1435");
			Statement s=conn.createStatement();
			String update="delete from tickets where travel="+trainno;
		    int count=s.executeUpdate(update);
		    System.out.println(count);
    }catch(SQLException e) {
    	e.printStackTrace();
    }
	}
}
