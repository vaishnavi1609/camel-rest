package com.example.demo.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.demo.bean.Employee;


public class EmpProcessor  implements Processor{

	Map<Integer,Employee> empList= new HashMap<>();
	
	@Override
	public void process(Exchange exchange) throws Exception {
		empList.put(1,new Employee("1","xyz"));
		empList.put(2,new Employee("2","abc"));
		
		String request =  exchange.getIn().getBody(java.lang.String.class);
		Employee response = empList.get(Integer.parseInt(request));
		
		if (response == null)
			exchange.getIn().setBody("No employee found with id "+ request, String.class);
		else
			exchange.getIn().setBody(response, Employee.class);
	}

}
