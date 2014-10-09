/*package de.vogella.mysql.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	private Connection connect = null;
	  private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;
	  
	  public void readDataBase() throws Exception {
		    try {
		      //load the MySQL driver
		      Class.forName("com.mysql.jdbc.Driver");ç
		      //setup the connection with the DB.
		      connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"
		              + "user=sqluser&password=sqluserpw");
		      // statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      // resultSet gets the result of the SQL query
		      resultSet = statement.executeQuery("select * from ejemplo1");
		      writeResultSet(resultSet);
		    
		       } 
		    catch (Exception e) {
		        throw e;
		      } finally {
		        close();
		      }

		    }*/