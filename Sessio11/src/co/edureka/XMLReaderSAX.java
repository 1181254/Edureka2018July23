package co.edureka;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void startDocument() throws org.xml.sax.SAXException {
		System.out.println("==XML Document Parsing Started==");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String text = new String(ch,start,length);
		System.out.print(text);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("==XML Document Parsing Ended==");
	}
}

public class XMLReaderSAX {

	public static void main(String[] args) {
	
		try{
		
			MyHandler handler = new MyHandler();
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			FileInputStream fis = new FileInputStream(file);
		
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			
			parser.parse(fis, handler);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
				

	}

}
