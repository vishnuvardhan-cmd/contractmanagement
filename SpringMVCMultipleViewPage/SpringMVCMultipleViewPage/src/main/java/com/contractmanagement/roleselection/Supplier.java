package com.contractmanagement.roleselection;

public class Supplier {
	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	private String ContactNumber;
	private int SupplierId;
	private String Password;
	public Supplier(String firstName, String lastName, int age, String gender, String contactNumber, int suppilerId,
			String password) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Gender = gender;
		this.ContactNumber = contactNumber;
		this.SupplierId = suppilerId;
		this.Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int suppilerId) {
		SupplierId = suppilerId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Supplier [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Gender=" + Gender
				+ ", ContactNumber=" + ContactNumber + ", SupplierId=" + SupplierId + ", Password=" + Password + "]";
	}
	
}
