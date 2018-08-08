package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Student;

public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	//1
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Loading the Bytecode, help to execute static blocks
			System.out.println("===Driver Loaded===");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2
	public void createConection(){
		try {
			
			String url = "jdbc:mysql://localhost/edurekajuly";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("===Connection Created===");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int insertStudent(Student sRef){
		
		int i = 0;
		
		try {

			//3
			//String sql = "insert into Student values(null,'"+sRef.name+"','"+sRef.phone+"',"+sRef.age+",'"+sRef.address+"')";
			
			//4
			//stmt = con.createStatement();
			//i = stmt.executeUpdate(sql); // Fire SQL Statement
			
			//3
			String sql = "insert into Student values(null, ?, ?, ?, ?)"; //? -> Wild Card Character
			
			//4
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setString(2, sRef.phone);
			pStmt.setInt(3, sRef.age);
			pStmt.setString(4, sRef.address);
			
			i = pStmt.executeUpdate();
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int updateStudent(Student sRef){
		
		int i = 0;
		
		try {

			
			//3
			String sql = "update Student set name=?, phone=?, age=?, address=? where roll = ?";
			
			//4
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setString(2, sRef.phone);
			pStmt.setInt(3, sRef.age);
			pStmt.setString(4, sRef.address);
			pStmt.setInt(5, sRef.roll);
			
			i = pStmt.executeUpdate();
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int deleteStudent(int roll){
		
		int i = 0;
		
		try {

			
			//3
			String sql = "delete from Student where roll = ?";
			
			//4
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, roll);
			
			i = pStmt.executeUpdate();
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public ArrayList<Student> fetchStudents(){
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		try {

			//3
			String sql = "select * from Student";
			
			//4
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				
				Student s = new Student();
				
				s.roll = rs.getInt(1);
				s.name = rs.getString(2);
				s.phone = rs.getString(3);
				s.age = rs.getInt(4);
				s.address= rs.getString(5);
				
				students.add(s);
			}
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public void executeProcedure(Student sRef){
		
		int i = 0;
		
		try {

			//3
			String sql = "{ call insertStudent(?,?,?,?) }"; // insertStudent is a Stored Procedure created by us in MySQL
			
			//4
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, sRef.name);
			cStmt.setString(2, sRef.phone);
			cStmt.setInt(3, sRef.age);
			cStmt.setString(4, sRef.address);
			
			cStmt.execute();
			
			System.out.println("===Procedure Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeConenction(){
		try {
			con.close();
			System.out.println("===Connection Closed===");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
