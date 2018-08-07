package co.edureka;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLWriter {

	public static void main(String[] args) {
		
		try {
			
			// API's
			// Design Pattern : A specific Way to create an Object (Factory Pattern)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Created a Document Object which is a tree structure
			
			Element rootElement = document.createElement("employees");
			
			Element empElement = document.createElement("employee");
			
			Element eidElement = document.createElement("eid");
			Element nameElement = document.createElement("name");
			Element salaryElement = document.createElement("salary");
			Element desigElement = document.createElement("designation");
			Element addressElement = document.createElement("address");
			
			Text eidText = document.createTextNode("101");
			Text nameText = document.createTextNode("John Watson");
			Text salaryText = document.createTextNode("70000");
			Text desigText = document.createTextNode("HR");
			Text addressText = document.createTextNode("Redwood Shores");
			
			eidElement.appendChild(eidText);
			nameElement.appendChild(nameText);
			salaryElement.appendChild(salaryText);
			desigElement.appendChild(desigText);
			addressElement.appendChild(addressText);
			
			empElement.appendChild(eidElement);
			empElement.appendChild(nameElement);
			empElement.appendChild(salaryElement);
			empElement.appendChild(desigElement);
			empElement.appendChild(addressElement);
			
			rootElement.appendChild(empElement);
			
			document.appendChild(rootElement);
			
			// Convert Document to XML File.
			
			// Source
			DOMSource source = new DOMSource(document);
			
			// Result
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			FileOutputStream fos = new FileOutputStream(file);
			StreamResult result = new StreamResult(fos);
			
			// Transform Source to Result we need Transformer API
			//TransformerFactory tFactory = TransformerFactory.newInstance();
			//Transformer transformer = tFactory.newTransformer();
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println("===XML File Generated===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
