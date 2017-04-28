package com.jeegroupproject.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jeegroupproject.database.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
//import com.jeegroupproject.bcrypt.*;

public class Employee {
	private int person_id;
	public int getPerson_id() {
		return person_id;
	}


	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}


	public String getPerson_external_id() {
		return person_external_id;
	}


	public void setPerson_external_id(String person_external_id) {
		this.person_external_id = person_external_id;
	}


	public String getPerson_firstname() {
		return person_firstname;
	}


	public void setPerson_firstname(String person_firstname) {
		this.person_firstname = person_firstname;
	}


	public String getPerson_lastname() {
		return person_lastname;
	}


	public void setPerson_lastname(String person_lastname) {
		this.person_lastname = person_lastname;
	}


	public String getPerson_email() {
		return person_email;
	}


	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}


	public String getPerson_password() {
		return person_password;
	}


	public void setPerson_password(String person_password) {
		this.person_password = person_password;
	}


	public String getPerson_token() {
		return person_token;
	}


	public void setPerson_token(String person_token) {
		this.person_token = person_token;
	}


	public Date getPerson_dob() {
		return person_dob;
	}


	public void setPerson_dob(Date person_dob) {
		this.person_dob = person_dob;
	}


	public int getPerson_advisor_id() {
		return person_advisor_id;
	}


	public void setPerson_advisor_id(int person_advisor_id) {
		this.person_advisor_id = person_advisor_id;
	}


	public int getPerson_is_advisor() {
		return person_is_advisor;
	}


	public void setPerson_is_advisor(int person_is_advisor) {
		this.person_is_advisor = person_is_advisor;
	}


	private String person_external_id;
	private String person_firstname;
	private String person_lastname;
	private String person_email;
	private String person_password;
	private String person_token;
	private Date person_dob;
	
	private int person_advisor_id;
	private int person_is_advisor;
	
	
	/* TODO
	 * prepare a method to insert stuff around
	 * public static void prepareSampledata(){
	 * to prepare a test sample of clients
	 * String iQuery = "INSERT INTO `users` (`id`, `name`, `surname`, `email`, `password`, `is_employee`, `is_customer`, `client_id`, `access_token`) VALUES (2, 'Toto', 'Tata', 'toto.tata@titi.fr', '$2y$10$a00IrSEYIIYI.CYC8pqGeu2G8uYMKhMj19GQRmeAR0YTJMs4RJJzO', 0, 1, 12345678, '');";

			statement.executeUpdate(iQuery));
		}
	 */
	
	public static Employee getClientByAccount_id(int account_id){
		
		Connection connection = DBConnectionFactory.getConnection(); //returns a prepared connection to the database
		Employee employee = new Employee();
		try {
			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement("SELECT person_external_id FROM sac_person WHERE person_advisor_id = '" + account_id + "'");
			pStatement.setInt(1, account_id);
			ResultSet result = pStatement.executeQuery();
	
			if(result.next()){ //check we have at least one result
				employee.setPerson_external_id( result.getString(2));

			}
				
		} catch (SQLException e) {
			System.err.println("problem querying");
			e.printStackTrace();
		}
		
		return employee;	
	}

	//TODO : getauthenticateduserbytoken similar to getauthenticated user
	//TODO : methode updatetokenforUser
		//generate a token called each time getauthenticateduser is called (see getauthenticated user)
		//SQL query to update the field in DB
	
	//TODO : Create a non-static method to save a client to database 
	
	
	


}
