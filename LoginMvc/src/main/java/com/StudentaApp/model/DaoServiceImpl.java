package com.StudentaApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoServiceImpl implements DaoService {
 private Connection con;
 private Statement stmnt;
	@Override
	public void connectionDB() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school" ,"root", "root@123");	
		stmnt=con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean verifyCredentials(String userid, String passwd) { 
		try {
			ResultSet result = stmnt.executeQuery("select * from stdlogin where Email='"+userid+"' and Password='"+passwd+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void saveReg(String name, String city, String email, String mobile) {
		try {
			stmnt.execute("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet ListRegistration() {
		
		try {
			ResultSet result  = stmnt.executeQuery("Select * from registration");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void deleteByEmail(String email) {
		try {
		stmnt.executeUpdate("Delete from registration where email='"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateReg(String email, String mobile) {
		
		try {
			stmnt.executeUpdate("UPDATE registration SET email='"+email+"' WHERE mobile= '"+mobile+"'");
			} catch (Exception e) {
				e.printStackTrace();
	}


	
	}
}
