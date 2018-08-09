package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "Samaira";
		s1.phone = "+91 90909 77777";
		s1.age = 35;
		s1.address = "Redwood Shores";
		
		Student s2 = new Student(8,"Ryna Watsone","+91 76786 99999",33,"Country Homes North");
		
		System.out.println("==========Stduent1===========");
		System.out.println(s1);
		System.out.println("==========Stduent2===========");
		System.out.println(s2);

		// OOPS : JDBCHelper
		
		//1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Create Connection
		helper.createConection();
		
		//3. 4. Write and Execute SQL Statement
		/*int i = helper.insertStudent(s1);
		if(i>0){
			System.out.println(s1.name+" inserted..");
		}
		
		i = helper.insertStudent(s2);
		if(i>0){
			System.out.println(s2.name+" inserted..");
		}*/
		
		/*int i = helper.updateStudent(s2);
		if(i>0){
			System.out.println(s2.name+" updated..");
		}*/
		
		/*int i = helper.deleteStudent(7);
		if(i>0){
			System.out.println("Roll Number 7 deleted..");
		}*/
		
		/*ArrayList<Student> list = helper.fetchStudents();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(Student s : list){
			System.out.println(s);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}*/
		
		//helper.executeProcedure(s1);
		
		helper.processBatch();
		
		//5. Close the Connection
		helper.closeConenction();
	}

}
