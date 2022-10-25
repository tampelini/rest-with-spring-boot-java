package com.tampelini.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		Double resp;
		
		try {
			resp = Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
		} catch (Exception e) {
			resp = 0D;
		}
			
		return resp;
	}
}
