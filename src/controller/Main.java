package controller;
	
import java.io.IOException;
import java.util.ArrayList;

import application.Customer;
import application.Details;
import application.Reservation;
import application.Vehicle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

// FIGURE OUT HOW TO CHECK DATES (check if date is before today and 
// ALSO HOW TO ONLY CLOSE ONE STAGE 
// STORING RESERVATIONS (Do I need to write to an xml file?)
// ADD SURCHARGE



public class Main extends Application 
{
	
	private Stage primaryStage;
	AnchorPane pane;
	public ArrayList<Customer> customers = new ArrayList<>();
	public ArrayList<Details> details = new ArrayList<>();
	public ArrayList<Vehicle> vehicles = new ArrayList<>();
	public ArrayList<Reservation> reservations = new ArrayList<>();
	
	public void addCustomer(Customer customer)
	{
		customers.clear();
		customers.add(customer);
	}
	public ArrayList<Customer> getCustomer()
	{
		return customers;
	}
	
	public void addDetail(Details detail)
	{
		details.clear();
		details.add(detail);
	}
	
	public ArrayList<Details> getDetails()
	{
		return details;
	}
	
	public void addVehicle(Vehicle vehicle)
	{
		vehicles.clear();
		vehicles.add(vehicle);
	}
	
	public ArrayList<Vehicle> getVehicle()
	{
		return vehicles;
	}
	
	public void addReservation(Reservation reservation)
	{
		reservations.add(reservation);
	}
	
	public ArrayList<Reservation> getReservation()
	{
		return reservations;
	}
	

	
	public double getPrice(String type)
	{
		double price=0;
		if(type.equals("compact"))
			price = 37.99;
		else if(type.equals("economy"))
			price = 39.99;
		else if(type.equals("standard"))
			price = 44.00;
		else if(type.equals("suv"))
			price = 48.99;
		else if(type.equals("pickup"))
			price = 59.99;
		else if(type.equals("minivan"))
			price = 59.99;
		return price;
	}
	
	@Override
	public void start(Stage primaryStage) 
	{
		this.primaryStage = primaryStage;
		Reservation reservation1 = new Reservation(1,"Darcy","Steele","765-357-5129","dtsteele@bsu.edu","4604654",21,"03/22/2018","03/24/2018","Muncie","Lafayette","Nissan Ultima","$117");
		reservations.add(reservation1);
		mainWindow();
	}
	
	
	
	//Start Primary Windows
	public void mainWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
			pane = loader.load();
			
			MainWindowController mainWindowController = loader.getController();
			mainWindowController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void customerInformationWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/CustomerInformation.fxml"));
			pane = loader.load();
			
			CustomerInformationController customerInformationController = loader.getController();
			customerInformationController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void reservationDetailsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/ReservationDetails.fxml"));
			pane = loader.load();
			
			ReservationDetailsController reservationDetailsController = loader.getController();
			reservationDetailsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void vehicleTypeWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/VehicleType.fxml"));
			pane = loader.load();
			
			VehicleTypeController vehicleTypeController = loader.getController();
			vehicleTypeController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void vehiclesWindow(String type)
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/VehiclesWindow.fxml"));
			pane = loader.load();
			
			VehiclesWindowController vehiclesWindowController = loader.getController();
			vehiclesWindowController.setMain(this, type);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void compactsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Compacts.fxml"));
			pane = loader.load();
			
			CompactsController compactsController = loader.getController();
			compactsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void suvsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Suvs.fxml"));
			pane = loader.load();
			
			SuvsController suvsController = loader.getController();
			suvsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void econsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Econs.fxml"));
			pane = loader.load();
			
			EconsController EconsController = loader.getController();
			EconsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void standardsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Standards.fxml"));
			pane = loader.load();
			
			StandardsController standardsController = loader.getController();
			standardsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void pickupsWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Pickups.fxml"));
			pane = loader.load();
			
			PickupsController pickupsController = loader.getController();
			pickupsController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void minivansWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Minivans.fxml"));
			pane = loader.load();
			
			MinivansController minivansController = loader.getController();
			minivansController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void employeeSignInWindow()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/EmployeeSignIn.fxml"));
			pane = loader.load();
			
			EmployeeSignInController employeeSignInController = loader.getController();
			employeeSignInController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	//Start Secondary Windows
	public void ageCheck()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/AgeCheck.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();
			
			AgeCheckController ageCheckController = loader.getController();
			ageCheckController.setMain(this, secondaryStage);
			
			secondaryStage.initOwner(primaryStage); 
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			secondaryStage.setScene(scene);
			secondaryStage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void employeeOptionsWindow()
	{
		try
		{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/EmployeeOptions.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();

			
			EmployeeOptionsController employeeOptionsController = loader.getController();
			employeeOptionsController.setMain(this, secondaryStage);
			
			secondaryStage.initOwner(primaryStage); 
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void employeeViewReservationsWindow(Reservation reservationa)
	{
		try
		{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/EmployeeViewReservations.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();

			
			EmployeeViewReservationsController employeeViewReservationsController = loader.getController();
			employeeViewReservationsController.setMain(this, secondaryStage,reservationa);
			
			secondaryStage.initOwner(primaryStage); 
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void employeeEditWindow(Reservation reservation)
	{
		try
		{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/EmployeeEdit.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();

			
			EmployeeEditController employeeEditController = loader.getController();
			employeeEditController.setMain(this, secondaryStage, reservation);
			
			secondaryStage.initOwner(primaryStage); 
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	//Start Third windows
	public void confirmationWindow()
	{
		try
		{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/Confirmation.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage thirdStage = new Stage();

			
			ConfirmationController confirmationController = loader.getController();
			confirmationController.setMain(this, thirdStage);
			
			thirdStage.initOwner(primaryStage); 
			thirdStage.initModality(Modality.WINDOW_MODAL);
			
			thirdStage.setScene(scene);
			thirdStage.show();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void vehicleInfoWindow(Vehicle vehicle)
	{
		try
		{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/VehicleInfo.fxml"));
			pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage thirdStage = new Stage();

			
			VehicleInfoController vehicleInfoController = loader.getController();
			vehicleInfoController.setMain(this, thirdStage, vehicle);
			
			thirdStage.initOwner(primaryStage); 
			thirdStage.initModality(Modality.WINDOW_MODAL);
			
			thirdStage.setScene(scene);
			thirdStage.show();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void closeWindow()
	{
		primaryStage.close();
	}
	
		
	public static void main(String[] args) 
	{
		
		launch(args);
	}
}
