package controller;

import application.Reservation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EmployeeViewReservationsController {

	private Main main;
	private Stage secondaryStage;
	private Reservation reservation;
	
	@FXML private Label pickupDateField;
	@FXML private Label carField;
	@FXML private Label ageField;
	@FXML private Label dlnField;
	@FXML private Label returnLocField;
	@FXML private Label priceField;
	@FXML private Label emailField;
	@FXML private Label lastNameField;
	@FXML private Label firstNameField;
	@FXML private Label phoneField;
	@FXML private Label pickupLocField;
	@FXML private Label returnDateField;
	
	
	
	public void setMain(Main main, Stage secondaryStage, Reservation reservation) 
	{
		this.main=main;
		this.reservation=reservation;
		setText(reservation);
	}

	public void setText(Reservation reservation)
	{
		
		pickupDateField.setText(reservation.getPickupdate());
		carField.setText(reservation.getCar());
		ageField.setText(Integer.toString(reservation.getAge()));
		dlnField.setText(reservation.getDln());
		returnLocField.setText(reservation.getReturnloc());
		priceField.setText(reservation.getPrice());
		emailField.setText(reservation.getEmail());
		lastNameField.setText(reservation.getLastName());
		firstNameField.setText(reservation.getFirstName());
		phoneField.setText(reservation.getPhone());
		pickupLocField.setText(reservation.getPickuploc());
		returnDateField.setText(reservation.getReturndate());
	}
	
	public void edit()
	{
		main.employeeEditWindow(this.reservation);
	}
	
	public void goBack()
	{
		secondaryStage.close();
		main.employeeOptionsWindow();
	}
	
	public void close()
	{
		secondaryStage.close();
	}
}
