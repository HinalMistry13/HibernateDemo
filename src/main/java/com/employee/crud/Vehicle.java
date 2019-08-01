package com.employee.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "vehicle_id")
	private long id;
	private String name;
	@ManyToMany(mappedBy = "vehicle")
	private List<Employee> employee = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}
	
}
