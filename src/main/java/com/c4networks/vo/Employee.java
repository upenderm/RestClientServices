package com.c4networks.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private Integer empId;
	private String empName;
	private String email;
	private String address;
	private String mobile;

	public Employee(){
		
	}
	public Employee(Integer empId, String empName, String email, String address, String mobile){
		this.address=address;
		this.email=email;
		this.empId=empId;
		this.empName=empName;
		this.mobile=mobile;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee Id :" + empId);
		sb.append("\nEmployee Name :" + empName);
		sb.append("\nEmployee Address :" + getAddress());
		sb.append("\nEmail :" + getEmail());
		sb.append("\nMobile :" + getMobile());
		return sb.toString();
	}

}
