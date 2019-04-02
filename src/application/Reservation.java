package application;

import java.util.Date;


public class Reservation 
{
	Integer conf;
	String firstName;
	String lastName;
	String phone;
	String email;
	String dln;
	Integer age;
	String pickupdate;
	String returndate;
	String pickuploc;
	String returnloc;
	String car;
	String price;
	
	public Reservation(int conf,String firstName,String lastName,String phone,String email,String dln,int age,String pickupdate,String returndate,String pickuploc,String returnloc,String car,String price)
	{
		this.conf=conf;
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.email=email;
		this.dln=dln;
		this.age=age;
		this.pickupdate=pickupdate;
		this.returndate=returndate;
		this.pickuploc=pickuploc;
		this.returnloc=returnloc;
		this.car=car;
		this.price=price;
	}
	

	
	//getters and setters

	public String getPhone() {
		return phone;
	}
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDln() {
		return dln;
	}
	public void setDln(String dln) {
		this.dln = dln;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPickupdate() {
		return pickupdate;
	}
	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public String getPickuploc() {
		return pickuploc;
	}
	public void setPickuploc(String pickuploc) {
		this.pickuploc = pickuploc;
	}
	public String getReturnloc() {
		return returnloc;
	}
	public void setReturnloc(String returnloc) {
		this.returnloc = returnloc;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getConf() {
		return conf;
	}
	public void setConf(int conf) {
		this.conf = conf;
	}

}
