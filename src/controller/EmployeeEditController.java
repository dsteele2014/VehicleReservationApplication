package controller;

import application.Reservation;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeEditController {

	private Main main;
	private Stage secondaryStage;
	private Reservation reservation;
	
	@FXML private TextField pickupDateField;
	@FXML private TextField carField;
	@FXML private TextField ageField;
	@FXML private TextField dlnField;
	@FXML private TextField returnLocField;
	@FXML private TextField priceField;
	@FXML private TextField emailField;
	@FXML private TextField lastNameField;
	@FXML private TextField firstNameField;
	@FXML private TextField phoneField;
	@FXML private TextField pickupLocField;
	@FXML private TextField returnDateField;
	

	public void setMain(Main main, Stage secondaryStage, Reservation reservation) 
	{
		this.main=main;
		this.reservation=reservation;
		this.secondaryStage=secondaryStage;
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
	

	public void save()
	{
		this.reservation.setPickupdate(pickupDateField.getText());
		this.reservation.setCar(carField.getText());
		this.reservation.setAge(Integer.parseInt(ageField.getText()));
		this.reservation.setDln(dlnField.getText());
		this.reservation.setReturnloc(returnLocField.getText());
		this.reservation.setPrice(priceField.getText());
		this.reservation.setEmail(emailField.getText());
		this.reservation.setLastName(lastNameField.getText());
		this.reservation.setFirstName(firstNameField.getText());
		this.reservation.setPhone(phoneField.getText());
		this.reservation.setPickuploc(pickupLocField.getText());
		this.reservation.setReturndate(returnDateField.getText());
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
