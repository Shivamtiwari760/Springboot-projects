package com.marketingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
	// for making the id the primary key we use @Id  annotation makes the primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// this is for the auto incrementation
   private int id;
	// when the database column name is "first_name"
	@Column(name="first_name",length=45,nullable=false)//lenght 45 means wit will crash after that name, nullable false means it wontstore the null values of now by aplying the constraint, name cannot be null
   private String firstName;
	@Column(name="last_name",length=45,nullable=false)
   private String lastName;
	@Column(name="email",length=128,nullable=false, unique =true)// unique true ,means you cannot store the duplicate emails in the database now

   private String email;
	@Column(name="mobile",nullable=false,unique=true)
   private long mobile;
   // and will generate getter and setters
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
}
