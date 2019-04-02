package controller;

import java.util.ArrayList;

import application.Reservation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeOptionsController 
{
	private Main main;
	private Stage secondaryStage;
	
	@FXML private TextField confField;
	@FXML private TextField nameField;
	@FXML private Label results;
	@FXML private ListView reservations1;
	
	public void setMain(Main main, Stage secondaryStage) 
	{ 
		this.main = main;
		this.secondaryStage = secondaryStage;
	}
	
	public void searchConf()
	{
		String search = confField.getText();
		if(search.equals(""))
		{
			results.equals("Search field cannot be blank.");
		}
		else
		{
			ArrayList<Reservation> reservations = main.getReservation();
			if(reservations.isEmpty())
			{
				results.setText("There are currently no reservations.");
			}
			else
			{
				for(int i=0; i<reservations.size();i++)
				{
					if(search.equals(Integer.toString(reservations.get(i).getConf())))
					{
						Reservation reservation = reservations.get(i);
						nextPage(reservation);
					}
					else
					{
						results.setText("No results found...");
					}
				}
			}
		}
		
	}
	
	public void searchName()
	{
		String search = nameField.getText();
		if(search.equals(""))
		{
			results.setText("Search field cannot be blank.");
		}
		else
		{
			ArrayList<Reservation> reservations = main.getReservation();
			if(reservations.isEmpty())
			{
				results.setText("There are currently no reservations.");
			}
			else
			{
				for(int i=0; i<reservations.size();i++)
				{
					if((search.equals(reservations.get(i).getLastName()+", "+reservations.get(i).getFirstName())))
					{
						Reservation reservation = reservations.get(i);
						nextPage(reservation);
					}
					else
					{
						results.setText("No results found...");
					}
				}
			}
		}
			
	}
	
	
	
	public void nextPage(Reservation reservation)
	{
		secondaryStage.close();
		main.employeeViewReservationsWindow(reservation);
	}
	
	public void goBack()
	{
		secondaryStage.close();
		main.mainWindow();
		

	}
	
	public void close()
	{
		secondaryStage.close();
	}
	
	
	
}
