package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.User;

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
	
	public int registeruser(User uRef){
		
		int i = 0;
		
		try {

			//3
			String sql = "insert into User values(null, ?, ?, ?)"; //? -> Wild Card Character
			
			//4
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.password);
			
			i = pStmt.executeUpdate();
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public boolean loginUser(User uRef){
		
		boolean flag = false;
		try {

			//3
			String sql = "select * from User where email = ? and password = ?"; //? -> Wild Card Character
			
			//4
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.email);
			pStmt.setString(2, uRef.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next(); // if record exists
			
			System.out.println("===Statement Executed===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
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