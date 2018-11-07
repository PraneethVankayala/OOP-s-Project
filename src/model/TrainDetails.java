package model;

public class TrainDetails {

	String name;
	String number;
	String deptime;
	String arivaltime;
	public TrainDetails(String name, String number, String deptime, String arivaltime) {
		super();
		this.name = name;
		this.number = number;
		this.deptime = deptime;
		this.arivaltime = arivaltime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDeptime() {
		return deptime;
	}
	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}
	public String getArivaltime() {
		return arivaltime;
	}
	public void setArivaltime(String arivaltime) {
		this.arivaltime = arivaltime;
	}
	
}
