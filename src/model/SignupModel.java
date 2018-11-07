package model;

public class SignupModel {

	public static String name;
	private String phonenumber;
	private String username;
	private String password;
	private String resetPassword;
	
	public SignupModel(String name, String phonenumber, String username, String password, String repass) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
		this.resetPassword=repass;
	}
	
	public String getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
