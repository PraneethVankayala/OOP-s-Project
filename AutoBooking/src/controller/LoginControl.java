package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.LoginModel;
import views.HomePage;
import views.Login;

public class LoginControl {

	public boolean check(String name,String password) {
		LoginModel lm=new LoginModel(name,password);
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
			Statement sta=conn.createStatement();
			
			String select="SELECT * FROM signup WHERE username='"+name+"' AND password='"+password+"'";
			ResultSet rset=sta.executeQuery(select);
			
			if(rset.next()) {
				return true;
			}
			
			
		}catch(SQLException p) {
			p.printStackTrace();
			return false;
		}
		return false;
	}
}
