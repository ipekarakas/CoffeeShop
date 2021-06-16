package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	 
	private int  Id;
	private String firtName;
	private String lastName;
	private String dateOfBirth;
	private String nationalId;
	
	
	public Customer(int id, String firtName, String lastName, String dateOfBirth, String nationalId) {
		
		this.Id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirtName() {
		return firtName;
	}


	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public Customer() {
		
	}


	public int setNationalId(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
