package com.tampelini;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping(value = "/teste/{str}", method = RequestMethod.GET)
	public String Test(@PathVariable(value = "str") String str ) {
		return str;
	}
}
