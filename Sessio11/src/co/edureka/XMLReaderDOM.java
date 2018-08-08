package co.edureka;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//Model
class Employee{
	int eid;
	String name;
	int salary;
	String designation;
	String address;
	
	void showEmployee(){
		System.out.println(eid+"\t"+name+"\t"+salary+"\t"+designation+"\t"+address);
	}
	
}

// Controller
public class XMLReaderDOM {

	public static void main(String[] args) {
		try {
			
			ArrayList<Employee> employees = new ArrayList<Employee>();
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			
			// API's
			// Design Pattern : A specific Way to create an Object (Factory Pattern)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Created a Document Object which is a tree structure
			
			System.out.println("Root Element: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println("nodeList size is: "+nodeList.getLength());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				Element elm = (Element)node;
				
				Employee emp = new Employee();
				emp.eid = Integer.parseInt(elm.getElementsByTagName("eid").item(0).getTextContent());
				emp.name = elm.getElementsByTagName("name").item(0).getTextContent();
				emp.salary = Integer.parseInt(elm.getElementsByTagName("salary").item(0).getTextContent());
				emp.designation = elm.getElementsByTagName("designation").item(0).getTextContent();
				emp.address = elm.getElementsByTagName("address").item(0).getTextContent();
				
				employees.add(emp);
				
				emp.showEmployee();
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
