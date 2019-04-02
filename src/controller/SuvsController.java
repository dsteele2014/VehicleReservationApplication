package controller;

import application.Vehicle;
import application.VehicleParser;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SuvsController 
{
	private Main main;
	VehicleParser parser = new VehicleParser();

	
	@FXML private Label car1;
	@FXML private Label car2;
	@FXML private Label car3;
	@FXML private Label car4;
	@FXML private Label car5;
	@FXML private Label cap1;
	@FXML private Label cap2;
	@FXML private Label cap3;
	@FXML private Label cap4;
	@FXML private Label cap5;
	@FXML private Label mpg1;
	@FXML private Label mpg2;
	@FXML private Label mpg3;
	@FXML private Label mpg4;
	@FXML private Label mpg5;
	@FXML private Label avail1;
	@FXML private Label avail2;
	@FXML private Label avail3;
	@FXML private Label avail4;
	@FXML private Label avail5;
	
	
	public void setMain(Main main) 
	{
		this.main=main;
		parser.parseVehicles();
		setText();
	}
	
	public void setText()
	{
		
		car1.setText(parser.suvs.get(0).getMake()+" "+parser.suvs.get(0).getModel());
		cap1.setText("Capacity: " + parser.suvs.get(0).getCapacity());
		mpg1.setText("Mpg: " +parser.suvs.get(0).getMpg());
		avail1.setText(parser.suvs.get(0).getAvail());
		car2.setText(parser.suvs.get(1).getMake()+" "+parser.suvs.get(1).getModel());
		cap2.setText("Capacity: " + parser.suvs.get(1).getCapacity());
		mpg2.setText("Mpg: " +parser.suvs.get(1).getMpg());
		avail2.setText(parser.suvs.get(1).getAvail());
		car3.setText(parser.suvs.get(2).getMake()+" "+parser.suvs.get(2).getModel());
		cap3.setText("Capacity: " + parser.suvs.get(2).getCapacity());
		mpg3.setText("Mpg: " +parser.suvs.get(2).getMpg());
		avail3.setText(parser.suvs.get(2).getAvail());
		car4.setText(parser.suvs.get(3).getMake()+" "+parser.suvs.get(3).getModel());
		cap4.setText("Capacity: " + parser.suvs.get(3).getCapacity());
		mpg4.setText("Mpg: " +parser.suvs.get(3).getMpg());
		avail4.setText(parser.suvs.get(3).getAvail());
		car5.setText(parser.suvs.get(4).getMake()+" "+parser.suvs.get(4).getModel());
		cap5.setText("Capacity: " + parser.suvs.get(4).getCapacity());
		mpg5.setText("Mpg: " +parser.suvs.get(4).getMpg());
		avail5.setText(parser.suvs.get(4).getAvail());
		
	}
	
	public void button0()
	{
		
			Vehicle vehicle = parser.suvs.get(0);
			main.addVehicle(vehicle);
			nextPage(vehicle);
		
	}
	
	public void button1()
	{
			Vehicle vehicle = parser.suvs.get(1);
			main.addVehicle(vehicle);
			nextPage(vehicle);
		
	}
	public void button2()
	{
			Vehicle vehicle = parser.suvs.get(2);
			main.addVehicle(vehicle);
			nextPage(vehicle);
		
	}
	public void button3()
	{
			Vehicle vehicle = parser.suvs.get(3);
			main.addVehicle(vehicle);
			nextPage(vehicle);
		
	}
	public void button4()
	{
			Vehicle vehicle = parser.suvs.get(4);
			main.addVehicle(vehicle);
			nextPage(vehicle);
	}
	public void nextPage(Vehicle vehicle)
	{
		main.vehicleInfoWindow(vehicle);
	}
	
	public void goBack()
	{
		main.vehicleTypeWindow();
	}
	
	public void close()
	{
		main.closeWindow();
	}
	
}


