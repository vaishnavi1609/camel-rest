package com.example.demo;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("<Date>"+new Date()+"</Date>");
	}

}
