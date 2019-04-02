package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import application.Details;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReservationDetailsController 
{
	@FXML private TextField pickupDate;
	@FXML private TextField returnDate;
	@FXML private TextField pickupLocation;
	@FXML private TextField returnLocation;
	@FXML private Label error;
	
	DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	
	private Main main;
	
	public void setMain(Main main) 
	{
		this.main=main;
	}
	
	public void submit()
	{
		int days =0;
		String pDate = pickupDate.getText();
		String rDate = returnDate.getText();
		String pLoc = pickupLocation.getText();
		String rLoc = returnLocation.getText();
		try
		{
			Date a = format.parse(pDate);
			Date b = format.parse(rDate);
			Date today = Calendar.getInstance().getTime();
			long diff = b.getTime() - a.getTime();
			days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			
			Details detail =new Details(pDate,rDate,pLoc,rLoc,days);
			main.addDetail(detail);
			if(pDate.equals("")||rDate.equals("")||pLoc.equals("")||rLoc.equals(""))
			{
				
				error.setText("You must fill in all fields to continue.");
			}
			else
			{
				
				nextPage();
			}
		}
		catch(ParseException e)
		{
			error.setText("Invalid date format.");
		}
	}
	
	public void nextPage()
	{
		main.vehicleTypeWindow();
	}
	
	public void goBack()
	{
		main.customerInformationWindow();
	}
	
	public void close()
	{
		main.closeWindow();
	}
}
