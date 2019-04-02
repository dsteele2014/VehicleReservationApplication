package controller;


import java.util.ArrayList;

import application.Details;
import application.Vehicle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VehicleInfoController 
{
	private Main main;
	private Stage thirdStage;
	@FXML private Label capacity;
	@FXML private Label mpg;
	@FXML private Label trans;
	@FXML private Label pickupdate;
	@FXML private Label returndate;
	@FXML private Label price;
	@FXML private Label car;
	@FXML private Button closeButton;
	
	public void setMain(Main main,Stage thirdStage, Vehicle vehicle)
	{
		this.main=main;
		this.thirdStage=thirdStage;
		setText(vehicle);
	}
	
	public void setText(Vehicle vehicle)
	{
		ArrayList<Details> detail = main.getDetails();
		car.setText(vehicle.getMake()+" "+ vehicle.getModel());
		capacity.setText(vehicle.getCapacity());
		mpg.setText(vehicle.getMpg());
		trans.setText(vehicle.getTrans());
		pickupdate.setText(detail.get(0).getA());
		returndate.setText(detail.get(0).getB());
		price.setText("$"+main.getPrice(vehicle.getType())*detail.get(0).getDays());

	}
	
	public void reserve()
	{
		nextPage();
	}
	
	public void nextPage()
	{
		main.confirmationWindow();
	}
	
	public void close()
	{
		thirdStage.close();
	}
}
