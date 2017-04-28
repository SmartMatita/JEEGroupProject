package com.employee;
import java.util.Date;

public class Operations {

	private double montant;
	private Date date;
	
	public Operations(double montant, Date date){
		this.montant = montant;
		this.date = date;
	}
	
	public String toString(){
		return "(" + montant + ", " + date + ")";
}
}