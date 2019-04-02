package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VehicleParser 
{
	public  ArrayList<Vehicle> compacts = new ArrayList<>(); 
	public  ArrayList<Vehicle> standards = new ArrayList<>(); 
	public  ArrayList<Vehicle> suvs = new ArrayList<>(); 
	public  ArrayList<Vehicle> econs = new ArrayList<>(); 
	public ArrayList<Vehicle> minivans = new ArrayList<>(); 
	public ArrayList<Vehicle> pickups = new ArrayList<>(); 
	
	public void parseVehicles() 
	{
		String type = null;
		String make = null;
		String model = null;
		String capacity = null;
		String mpg = null;
		String trans = null;
		
		
		try
		{
			File input = new File("vehicle.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(input);
			
			NodeList nodes = doc.getElementsByTagName("car");
			
			for(int i = 0 ; i<nodes.getLength(); i++)
			{
				Node node = nodes.item(i);
				if(node.getNodeType()== Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					type=element.getAttribute("type");
					make = element.getElementsByTagName("make").item(0).getTextContent();
					model = element.getElementsByTagName("model").item(0).getTextContent();
					capacity = element.getElementsByTagName("capacity").item(0).getTextContent();
					mpg = element.getElementsByTagName("mpg").item(0).getTextContent();
					trans = element.getElementsByTagName("trans").item(0).getTextContent();
					
				}
				Vehicle vehicle = new Vehicle(type,make,model,capacity,mpg,trans);
				if(vehicle.getType().equals("compact"))
				{
					compacts.add(vehicle);
				}
				else if(vehicle.getType().equals("standard"))
				{
					standards.add(vehicle);
				}
				else if(vehicle.getType().equals("suv"))
				{
					suvs.add(vehicle);
				}
				else if(vehicle.getType().equals("economy"))
				{
					econs.add(vehicle);
				}
				else if(vehicle.getType().equals("pickup"))
				{
					pickups.add(vehicle);
				}
				else if(vehicle.getType().equals("minivan"))
				{
					minivans.add(vehicle);
				}
				
			}
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
}
