package com.example.HelloConsul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody String getHello() {
		return "Hello";
	}
}
