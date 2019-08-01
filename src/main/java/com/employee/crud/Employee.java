package com.employee.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private long id;
	private String name;

	@OneToOne
	@JoinColumn(name = "address")
	private Address address;
	
	@OneToMany(mappedBy = "employee")
	private List<Mobile> mobile = new ArrayList<Mobile>();
	
	@ManyToMany
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";//, address=" + address + ", mobile=" + mobile + ", vehicle=" + vehicle + "]";
	}
	
	
}
