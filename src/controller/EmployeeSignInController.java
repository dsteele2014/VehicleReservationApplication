package controller;

import application.Account;
import application.AccountParser;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EmployeeSignInController 
{

	String un= "username1";
	String ps= "password1";
	
	private Main main;
	@FXML private TextField userNameField;
	@FXML private TextField passwordField;
	@FXML private Label error;
	
	
	
	public void setMain(Main main) 
	{
		this.main=main;
	}

	public void signIn()
	{
		AccountParser parser = new AccountParser();
		parser.parseAccounts();
		String userName=userNameField.getText();
		String password=passwordField.getText();
		int a = 1;
		while(a == 1)
		{
			for (Account account : Account.accounts) 
			{
				String un = account.getUserName();
				String ps = account.getPassword();
				if (userName.equals(un) && password.equals(ps))
				{
					a = 0;
					nextPage();
					goBack();
				}
				else
				{
					a = 0;
					error.setText("The username or password you have entered is invalid.");
				}
			}
		}
	}
	
	
	public void nextPage()
	{
		main.employeeOptionsWindow();
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
