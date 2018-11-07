package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import views.SignUp;
import model.SignupModel;

public class SignupContol {

	public void enterFields(String s,String i,String user,String pass,String repass)  {
		
		
		SignupModel sm=new SignupModel(s,i,user,pass,repass);

		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
			Statement sta=conn.createStatement();
			
			String update="INSERT INTO signup(name, phone, username,password) VALUES ('"+s+"','"+i+"','"+user+"','"+pass+"')";
			
			int countupdate=sta.executeUpdate(update);
			System.out.println(countupdate);
			
		}catch(SQLException p) {
			p.printStackTrace();
		}
	}
	
	
}
