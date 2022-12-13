package com.masai;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
	
	
	@Min(value = 10, message = "{roll.invalid}")
	private Integer roll;
	
	
	@Size(min = 3, max = 15, message = "{name.invalid}")
	private String name;
	private String address;
	
	@Email(message = "Please pass a valid email")
	@NotNull(message = "Email is mandatory")
	private String email;
	private Integer marks;
	
	
	
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", marks="
				+ marks + "]";
	}
	
	

}
