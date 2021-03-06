package com.amaljoyc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private CureBfService service;
	
	@RequestMapping(path="/json", method = RequestMethod.GET)
	public ApiResponse returnJson() {
		return service.buildApiResponse();
	}

}

