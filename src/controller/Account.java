package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.LoginModel;
import model.SignupModel;

public class Account {
	
	private String name;
	private String phonenumber;
	private String username;
	private String image;

	public void details() {
		
		try {
			String n=LoginModel.getUsername();
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
			Statement sta=conn.createStatement();
			String update="SELECT * FROM signup WHERE username='"+LoginModel.getUsername()+"'";
			
			ResultSet s=sta.executeQuery(update);
			while(s.next()) {
				int id=s.getInt("id");
				name=s.getString("name");
				phonenumber=s.getString("phone");
				username=s.getString("username");
				String password=s.getString("password");
				image=s.getString("image");			
			}
			
		}catch(SQLException p) {
			p.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
public void changePassword(String passwo) {
		
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
			Statement sta=conn.createStatement();
			
			String update="UPDATE signup SET password='"+passwo+"' WHERE username='"+LoginModel.getUsername()+"'";
			
			int s=sta.executeUpdate(update);
			
		}catch(SQLException p) {
			p.printStackTrace();
		}
	}

public void changeName(String name) {
	
	try {
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
		Statement sta=conn.createStatement();
		String update="UPDATE signup SET name='"+name+"' WHERE username='"+LoginModel.getUsername()+"'";
		
		int s=sta.executeUpdate(update);
		
	}catch(SQLException p) {
		p.printStackTrace();
	}
}

public void changeNumber(String phone) {
	
	try {
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
		Statement sta=conn.createStatement();
		String update="UPDATE signup SET phone='"+phone+"' WHERE username='"+LoginModel.getUsername()+"'";
		
		int s=sta.executeUpdate(update);
		
	}catch(SQLException p) {
		p.printStackTrace();
	}
}

public void DeleteAccount() {
	
	try {
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "bunny", "amma1435");
		Statement sta=conn.createStatement();
		
		String update="DELETE FROM signup  WHERE username='"+LoginModel.getUsername()+"'";
		
		int s=sta.executeUpdate(update);
		
	}catch(SQLException p) {
		p.printStackTrace();
	}
}
}
