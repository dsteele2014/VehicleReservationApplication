package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VehicleTypeController 
{
	private Main main;
	@FXML private Label compact;
	@FXML private Label standard;
	@FXML private Label economy;
	@FXML private Label suv;
	@FXML private Label pickup;
	@FXML private Label minivan;
	@FXML private Label compactPrice;
	@FXML private Label standardPrice;
	@FXML private Label economyPrice;
	@FXML private Label suvPrice;
	@FXML private Label pickupPrice;
	@FXML private Label minivanPrice;
	
	
	public void setMain(Main main) 
	{
		this.main=main;
		setText();
	}
	
	public void setText()
	{
		compactPrice.setText("$" +Double.toString(main.getPrice("compact"))+" per day");
		standardPrice.setText("$" +Double.toString(main.getPrice("standard"))+" per day");
		economyPrice.setText("$" +Double.toString(main.getPrice("economy"))+" per day");
		suvPrice.setText("$" +Double.toString(main.getPrice("suv"))+" per day");
		pickupPrice.setText("$" +Double.toString(main.getPrice("pickup"))+" per day");
		minivanPrice.setText("$" +Double.toString(main.getPrice("minivan"))+" per day");

	}
	
	public void compact()
	{
		//type = "compact";
		main.compactsWindow();
		//nextPage(type);
	}
	public void standard()
	{
		main.standardsWindow();
	}
	public void economy()
	{
		main.econsWindow();
	}
	public void suv()
	{
		main.suvsWindow();
	}
	public void pickup()
	{
		main.pickupsWindow();
	}
	public void minivan()
	{
		main.minivansWindow();
	}
	
	
	
	public void goBack()
	{
		main.reservationDetailsWindow();
	}
	
	public void close()
	{
		main.closeWindow();
	}

}
