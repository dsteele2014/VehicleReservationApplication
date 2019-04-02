package application;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AccountParser 
{
	public void parseAccounts()
	{
		String type =null;
		String userName = null;
		String password = null;
		
		
		try
		{
			File input = new File("accounts.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(input);
			NodeList nodes = doc.getElementsByTagName("account");
			for(int i = 0 ; i<nodes.getLength(); i++)
			{
				Node node = nodes.item(i);
				if(node.getNodeType()== Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					type=element.getAttribute("type");
					userName = element.getElementsByTagName("username").item(0).getTextContent();
					password = element.getElementsByTagName("password").item(0).getTextContent();
					
				}
				Account account = new Account(type,userName,password);
				account.addAccount();		

			}
					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		} catch (SAXException e) 
		{
			e.printStackTrace();
		}
	}
}

