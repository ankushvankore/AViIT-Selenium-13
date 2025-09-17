package com.StepDef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07Registration {
	@Given("Launch the page")
	public void launch_the_page() {
	    System.out.println("Launching Registration Page");
	}

	@When("I Enter the data as follows")
	public void i_enter_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    
	    System.out.println(data);
	    
	    //System.out.println(data.get(0).get(1));
	    for(List<String> d : data)
	    	System.out.println(d);
	    
	    for(List<String> d : data)
	    {
	    	for(String e : d)
	    		System.out.println(e);
	    }
	}

	@Then("registration should successful")
	public void registration_should_successful() {
	    System.out.println("Thank you for registration!!!");
	}
}
