package com.example.demo.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    private String empId;

    private String name;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String id) {
		this.empId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String id, String name) {
		super();
		this.empId = id;
		this.name = name;
	}
	public Employee() {
	}
}
