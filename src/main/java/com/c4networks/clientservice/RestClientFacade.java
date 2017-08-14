package com.c4networks.clientservice;

import javax.ws.rs.core.MediaType;

import com.c4networks.vo.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClientFacade {

	public String createEmployee(String empId, String empName, String address, String email, String mobile) {
		Client client = Client.create();
		WebResource wr = client.resource("http://localhost:8080/RestServices/rest/employee/createEmp");
		String input = "{\"empId\":\"" + empId + "\",\"address\":\"" + address + "\",\"mobile\":\"" + mobile
				+ "\",\"email\":\""+email+"\",\"empName\":\""+empName+"\"}";
		Employee emp = new Employee(new Integer(empId),empName,email,address,mobile);
		ClientResponse response = wr.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, emp);
		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed with HTTP error code :" + response.getStatus());
		}
		String output = response.getEntity(String.class);
		System.out.println("Output is -->:" + output);
		return output;
	}

	public Employee getEmployeeDetails(int empId) {
		System.out.println("emp id In facade is :" + empId);
		Client client = Client.create();
		WebResource wr = client.resource("http://localhost:8080/RestServices/rest/employee/getEmpDtls?empId=" + empId);
		ClientResponse response = wr.type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed with HTTP error code :" + response.getStatus());
		}
		System.out.println("Output from Rest SErvice server call is ::");
		Employee output = response.getEntity(Employee.class);
		return output;
	}

}
