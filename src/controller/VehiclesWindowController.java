package controller;

import application.Vehicle;
import application.VehicleParser;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VehiclesWindowController 
{
	private Main main;
	private String type;
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
	
	
	public void setMain(Main main, String type) 
	{
		this.main=main;
		this.type=type;
		parser.parseVehicles();
		setText(type);
	}
	
	public void setText(String type)
	{
		
		if(type.equals("compact"))
		{
			car1.setText(parser.compacts.get(0).getMake()+" "+parser.compacts.get(0).getModel());
			cap1.setText("Capacity: " + parser.compacts.get(0).getCapacity());
			mpg1.setText("Mpg: " + parser.compacts.get(0).getMpg());
			avail1.setText(parser.compacts.get(0).getAvail());
			car2.setText(parser.compacts.get(1).getMake()+" "+parser.compacts.get(1).getModel());
			cap2.setText("Capacity: " + parser.compacts.get(1).getCapacity());
			mpg2.setText("Mpg: " +parser.compacts.get(1).getMpg());
			avail2.setText(parser.compacts.get(1).getAvail());
			car3.setText(parser.compacts.get(2).getMake()+" "+parser.compacts.get(2).getModel());
			cap3.setText("Capacity: " + parser.compacts.get(2).getCapacity());
			mpg3.setText("Mpg: " +parser.compacts.get(2).getMpg());
			avail3.setText(parser.compacts.get(2).getAvail());
			car4.setText(parser.compacts.get(3).getMake()+" "+parser.compacts.get(3).getModel());
			cap4.setText("Capacity: " + parser.compacts.get(3).getCapacity());
			mpg4.setText("Mpg: " +parser.compacts.get(3).getMpg());
			avail4.setText(parser.compacts.get(3).getAvail());
			car5.setText(parser.compacts.get(4).getMake()+" "+parser.compacts.get(4).getModel());
			cap5.setText("Capacity: " + parser.compacts.get(4).getCapacity());
			mpg5.setText("Mpg: " +parser.compacts.get(4).getMpg());
			avail5.setText(parser.compacts.get(4).getAvail());
		}
		else if(type.equals("suv"))
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
		else if(type.equals("standard"))
		{
			car1.setText(parser.standards.get(0).getMake()+" "+parser.standards.get(0).getModel());
			cap1.setText("Capacity: " + parser.standards.get(0).getCapacity());
			mpg1.setText("Mpg: " +parser.standards.get(0).getMpg());
			avail1.setText(parser.standards.get(0).getAvail());
			car2.setText(parser.standards.get(1).getMake()+" "+parser.standards.get(1).getModel());
			cap2.setText("Capacity: " + parser.standards.get(1).getCapacity());
			mpg2.setText("Mpg: " +parser.standards.get(1).getMpg());
			avail2.setText(parser.standards.get(1).getAvail());
			car3.setText(parser.standards.get(2).getMake()+" "+parser.standards.get(2).getModel());
			cap3.setText("Capacity: " + parser.standards.get(2).getCapacity());
			mpg3.setText("Mpg: " +parser.standards.get(2).getMpg());
			avail3.setText(parser.standards.get(2).getAvail());
			car4.setText(parser.standards.get(3).getMake()+" "+parser.standards.get(3).getModel());
			cap4.setText("Capacity: " + parser.standards.get(3).getCapacity());
			mpg4.setText("Mpg: " +parser.standards.get(3).getMpg());
			avail4.setText(parser.standards.get(3).getAvail());
			car5.setText(parser.standards.get(4).getMake()+" "+parser.standards.get(4).getModel());
			cap5.setText("Capacity: " + parser.standards.get(4).getCapacity());
			mpg5.setText("Mpg: " +parser.standards.get(4).getMpg());
			avail5.setText(parser.standards.get(4).getAvail());		}
		else if(type.equals("economy"))
		{
			car1.setText(parser.econs.get(0).getMake()+" "+parser.econs.get(0).getModel());
			cap1.setText("Capacity: " + parser.econs.get(0).getCapacity());
			mpg1.setText("Mpg: " +parser.econs.get(0).getMpg());
			avail1.setText(parser.econs.get(0).getAvail());
			car2.setText(parser.econs.get(1).getMake()+" "+parser.econs.get(1).getModel());
			cap2.setText("Capacity: " + parser.econs.get(1).getCapacity());
			mpg2.setText("Mpg: " +parser.econs.get(1).getMpg());
			avail2.setText(parser.econs.get(1).getAvail());
			car3.setText(parser.econs.get(2).getMake()+" "+parser.econs.get(2).getModel());
			cap3.setText("Capacity: " + parser.econs.get(2).getCapacity());
			mpg3.setText("Mpg: " +parser.econs.get(2).getMpg());
			avail3.setText(parser.econs.get(2).getAvail());
			car4.setText(parser.econs.get(3).getMake()+" "+parser.econs.get(3).getModel());
			cap4.setText("Capacity: " + parser.econs.get(3).getCapacity());
			mpg4.setText("Mpg: " +parser.econs.get(3).getMpg());
			avail4.setText(parser.econs.get(3).getAvail());
			car5.setText(parser.econs.get(4).getMake()+" "+parser.econs.get(4).getModel());
			cap5.setText("Capacity: " + parser.econs.get(4).getCapacity());
			mpg5.setText("Mpg: " +parser.econs.get(4).getMpg());
			avail5.setText(parser.econs.get(4).getAvail());		}
		else if(type.equals("pickup"))
		{
			car1.setText(parser.pickups.get(0).getMake()+" "+parser.pickups.get(0).getModel());
			cap1.setText("Capacity: " + parser.pickups.get(0).getCapacity());
			mpg1.setText("Mpg: " +parser.pickups.get(0).getMpg());
			avail1.setText(parser.pickups.get(0).getAvail());
			car2.setText(parser.pickups.get(1).getMake()+" "+parser.pickups.get(1).getModel());
			cap2.setText("Capacity: " + parser.pickups.get(1).getCapacity());
			mpg2.setText("Mpg: " +parser.pickups.get(1).getMpg());
			avail2.setText(parser.pickups.get(1).getAvail());
			car3.setText(parser.pickups.get(2).getMake()+" "+parser.pickups.get(2).getModel());
			cap3.setText("Capacity: " + parser.pickups.get(2).getCapacity());
			mpg3.setText("Mpg: " +parser.pickups.get(2).getMpg());
			avail3.setText(parser.pickups.get(2).getAvail());
			car4.setText(parser.pickups.get(3).getMake()+" "+parser.pickups.get(3).getModel());
			cap4.setText("Capacity: " + parser.pickups.get(3).getCapacity());
			mpg4.setText("Mpg: " +parser.pickups.get(3).getMpg());
			avail4.setText(parser.pickups.get(3).getAvail());
			car5.setText(parser.pickups.get(4).getMake()+" "+parser.pickups.get(4).getModel());
			cap5.setText("Capacity: " + parser.pickups.get(4).getCapacity());
			mpg5.setText("Mpg: " +parser.pickups.get(4).getMpg());
			avail5.setText(parser.pickups.get(4).getAvail());		}
		else if(type.equals("minivan"))
		{
			car1.setText(parser.minivans.get(0).getMake()+" "+parser.minivans.get(0).getModel());
			cap1.setText("Capacity: " + parser.minivans.get(0).getCapacity());
			mpg1.setText("Mpg: " +parser.minivans.get(0).getMpg());
			avail1.setText(parser.minivans.get(0).getAvail());
			car2.setText(parser.minivans.get(1).getMake()+" "+parser.minivans.get(1).getModel());
			cap2.setText("Capacity: " + parser.minivans.get(1).getCapacity());
			mpg2.setText("Mpg: " +parser.minivans.get(1).getMpg());
			avail2.setText(parser.minivans.get(1).getAvail());
			car3.setText(parser.minivans.get(2).getMake()+" "+parser.minivans.get(2).getModel());
			cap3.setText("Capacity: " + parser.minivans.get(2).getCapacity());
			mpg3.setText("Mpg: " +parser.minivans.get(2).getMpg());
			avail3.setText(parser.minivans.get(2).getAvail());
			car4.setText(parser.minivans.get(3).getMake()+" "+parser.minivans.get(3).getModel());
			cap4.setText("Capacity: " + parser.minivans.get(3).getCapacity());
			mpg4.setText("Mpg: " +parser.minivans.get(3).getMpg());
			avail4.setText(parser.minivans.get(3).getAvail());
			car5.setText(parser.minivans.get(4).getMake()+" "+parser.minivans.get(4).getModel());
			cap5.setText("Capacity: " + parser.minivans.get(4).getCapacity());
			mpg5.setText("Mpg: " +parser.minivans.get(4).getMpg());
			avail5.setText(parser.minivans.get(4).getAvail());		
			}
	}
	
	public void button0()
	{
		if(type.equals("compact"))
		{
			if(parser.compacts.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.compacts.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("suv"))
		{
			if(parser.suvs.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.suvs.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("enomony"))
		{
			if(parser.econs.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.econs.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("standard"))
		{
			if(parser.standards.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.standards.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("pickup"))
		{
			if(parser.pickups.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.pickups.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("minivan"))
		{
			if(parser.minivans.get(0).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.minivans.get(0);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
	}
	
	public void button1(String type)
	{
		if(type.equals("compact"))
		{
			if(parser.compacts.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.compacts.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("suv"))
		{
			if(parser.suvs.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.suvs.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("enomony"))
		{
			if(parser.econs.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.econs.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("standard"))
		{
			if(parser.standards.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.standards.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("pickup"))
		{
			if(parser.pickups.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.pickups.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("minivan"))
		{
			if(parser.minivans.get(1).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.minivans.get(1);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
	}
	public void button2(String type)
	{
		if(type.equals("compact"))
		{
			if(parser.compacts.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.compacts.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("suv"))
		{
			if(parser.suvs.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.suvs.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("enomony"))
		{
			if(parser.econs.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.econs.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("standard"))
		{
			if(parser.standards.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.standards.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("pickup"))
		{
			if(parser.pickups.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.pickups.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("minivan"))
		{
			if(parser.minivans.get(2).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.minivans.get(2);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
	}
	public void button3(String type)
	{
		if(type.equals("compact"))
		{
			if(parser.compacts.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.compacts.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("suv"))
		{
			if(parser.suvs.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.suvs.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("enomony"))
		{
			if(parser.econs.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.econs.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("standard"))
		{
			if(parser.standards.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.standards.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("pickup"))
		{
			if(parser.pickups.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.pickups.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("minivan"))
		{
			if(parser.minivans.get(3).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.minivans.get(3);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
	}
	public void button4(String type)
	{
		if(type.equals("compact"))
		{
			if(parser.compacts.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.compacts.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("suv"))
		{
			if(parser.suvs.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.suvs.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("enomony"))
		{
			if(parser.econs.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.econs.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("standard"))
		{
			if(parser.standards.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.standards.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("pickup"))
		{
			if(parser.pickups.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.pickups.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
		else if(type.equals("minivan"))
		{
			if(parser.minivans.get(4).getAvail().equals("UNAVAILABLE"))
			{
				Vehicle vehicle = parser.minivans.get(4);
				nextPage(vehicle);
			}
			else
			{
				
			}
		}
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
