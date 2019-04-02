package controller;

public class MainWindowController 
{
	private Main main;
	
	public void setMain(Main main) 
	{
		this.main=main;
	}
	
	public void nextCustomerPage()
	{
		main.customerInformationWindow();
	}
	
	public void nextEmployeePage()
	{
		main.employeeSignInWindow();
	}
	
	public void close()
	{
		main.closeWindow();
	}	
}