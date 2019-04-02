package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AgeCheckController 
{
	private Main main;

	@FXML private Button closeButton;
	@FXML private Button agreeButton;

	
	public void setMain(Main main, Stage secondaryStage)
	{
		this.main=main;
	}
	
	public void agreeButtonAction()
	{
		Stage stage = (Stage) agreeButton.getScene().getWindow();
		stage.close();
		main.reservationDetailsWindow();
	}
	
	public void closeButtonAction()
	{
		Stage stage = (Stage) closeButton.getScene().getWindow();
		stage.close();
	}
}
