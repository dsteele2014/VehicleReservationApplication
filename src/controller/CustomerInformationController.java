package controller;

import java.util.ArrayList;

import application.Customer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerInformationController 
{
	@FXML private Label label;
	@FXML private TextField firstNameField;
	@FXML private TextField lastNameField;
	@FXML private TextField phoneNumberField;
	@FXML private TextField emailAddressField;
	@FXML private TextField dlnField;
	@FXML private TextField ageField;
	@FXML private Label error;
	
	public static ArrayList<Customer> custs = new ArrayList<>(); 
	
	public CustomerInformationController()
	{
		
	}
	
	private Main main;
	public void setMain(Main main) 
	{
		this.main=main;
	}
	
	public void submit()
	{		

		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String phone = phoneNumberField.getText();
		String email = emailAddressField.getText();
		String dln = dlnField.getText();
		String age = ageField.getText();
		Customer cust = new Customer(firstName, lastName,phone,email,dln,age);
		main.addCustomer(cust);
		
		if(firstName.equals("")||lastName.equals("")||phone.equals("")||email.equals("")||dln.equals("")||age.equals(""))
		{
			error.setText("You must fill in all of the fields to continue.");

		}
		else
		{
			try
			{
				Integer.parseInt(age);
				if(Integer.parseInt(age) < 18)
				{
					error.setText("You must be 18 to rent a vehicle.");
				}
				else if(Integer.parseInt(age) < 25)
				{
					main.ageCheck();
				}
				else
				{
					nextPage();
				}
			}
			catch(NumberFormatException e)
			{
				error.setText("You must enter a number for age.");
			}
		}
	}

	public void nextPage()
	{
		main.reservationDetailsWindow();
	}
	
	public void goBack()
	{
		main.mainWindow();
	}
	
	public void close()
	{
		main.closeWindow();
	}

	
	
}
