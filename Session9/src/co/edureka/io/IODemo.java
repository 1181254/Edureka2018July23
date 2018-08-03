package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class IODemo {

	void writeInFile(){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/edureka.txt");
			File file = new File("/Users/ishantkumar/Downloads/MyProg.java");
			/*(if(file.exists()){
				System.out.println(file.getName()+" already exists");
			}else{
				System.out.println(file.getName()+" does not exists");
			}*/
			
			// API: Which writes the data in the form of bytes
			//FileOutputStream fos = new FileOutputStream(file);
			//FileOutputStream fos = new FileOutputStream(file,true); // true means append mode is enabled
			//String data = "\nSearch the Candle rather than cursing the darkness !!";
			//String data = "Be Exceptional !!";
			//fos.write(data.getBytes());
			//fos.close(); // Release the memory resources
			
			// API: FileWriter : Which writes the data in the form of text i.e String
			FileWriter writer = new FileWriter(file);
			//FileWriter writer = new FileWriter(file,true); // true is append mode enabled
			String javaCode = "class MyProg{ \n\n}";
			writer.write(javaCode);
			writer.close();
			
			System.out.println("==File Written==");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/MyProg.java");
			
			// FileInputStream API: Which reads the data in the form of bytes
			/*FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while((i = fis.read()) != -1){ // -1 is end of file
				char ch = (char)i;
				System.out.print(ch);
			}
			fis.close();
			*/
			
			// FileReader API: Which reads the data in the form of text
			//FileReader reader = new FileReader(file);
			//BufferedReader buffer = new BufferedReader(reader); // Buffer API reads the data line by line
			
			
			URL url = new URL("http://www.json-generator.com/api/json/get/chQLxhBjaW?indent=2");
			URLConnection connection = url.openConnection(); // Sending the request to the Server
			
			/*InputStream inputStream = connection.getInputStream();
			InputStreamReader reader = new InputStreamReader(inputStream);
			BufferedReader buffer = new BufferedReader(reader);*/
			
			// Reading the Response from Server
			BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line = "";
			while((line = buffer.readLine()) !=null){
				System.out.println(line);
			}
			
			buffer.close();
			//reader.close();
			
			// HW: Use newsapi.org to extract the latest news as JSON Data and thrafter do JSON Parsing !! 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		IODemo io = new IODemo();
		//io.writeInFile();
		io.readFromFile();

	}

}
