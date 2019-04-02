package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import application.Customer;
import application.Details;
import application.Reservation;
import application.Vehicle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmationController 
{
	private Main main;
	private Stage thirdStage;
	@FXML private Label confnum;
	@FXML private Label name;
	@FXML private Label phone;
	@FXML private Label email;
	@FXML private Label pickupdate;
	@FXML private Label dropoffdate;
	@FXML private Label pickuploc;
	@FXML private Label dropoffloc;
	@FXML private Label car;
	@FXML private Label price;
	private Integer conf;
	DateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	public void setMain(Main main, Stage thirdStage) 
	{
		this.main=main;
		this.thirdStage=thirdStage;
		setText();
		
	}
	
	public void setText()
	{
		ArrayList<Customer> customer = main.getCustomer();
		ArrayList<Details> details = main.getDetails();
		ArrayList<Vehicle> vehicles = main.getVehicle();

		Random rand = new Random();
		
		conf =(1000000 + rand.nextInt(8000000));
		confnum.setText(Integer.toString(conf));
		String name1=customer.get(0).getFirstName()+ " "+customer.get(0).getLastName();
		name.setText(name1);
		String phone1 =customer.get(0).getPhone();
		phone.setText(phone1);
		String email1 =customer.get(0).getEmail();
		email.setText(email1);
		String pud = details.get(0).getA();	
		pickupdate.setText(pud);
		String dod =details.get(0).getB();
		dropoffdate.setText(dod);
		String pul =details.get(0).getpLoc();
		pickuploc.setText(pul);
		String dol = details.get(0).getrLoc();
		dropoffloc.setText(dol);
		price.setText("$"+main.getPrice(vehicles.get(0).getType())*details.get(0).getDays());
		String car1 =vehicles.get(0).getMake()+" "+vehicles.get(0).getModel();
		car.setText(car1);	
		String dln =customer.get(0).getDln();
		String age1 = customer.get(0).getAge();
		int age = Integer.parseInt(age1);
		String firstName = customer.get(0).getFirstName();
		String lastName = customer.get(0).getLastName();
		
		Reservation reservation = new Reservation(conf,firstName,lastName,phone1,email1,dln,age,pud,dod,pul,dol,car1,"$"+main.getPrice(vehicles.get(0).getType())*details.get(0).getDays());
		main.addReservation(reservation);
		vehicles.get(0).setAvail("UNAVAILABLE");
		
	}
	

	public void close()
	{
		thirdStage.close();
	}
}
