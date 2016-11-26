package com.amaljoyc;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amaljoyc.models.Model;
import com.amaljoyc.models.Test;
import com.amaljoyc.repos.ModelRepo;
import com.amaljoyc.repos.TestRepo;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ModelRepo modelRepo;
	
	@Autowired
	private TestRepo testRepo;
	
	@RequestMapping(path="/model", method = RequestMethod.GET)
	public Iterable<Model> findModel() throws IOException {
		return modelRepo.findAll();
	}
	
	@RequestMapping(path="/test", method = RequestMethod.GET)
	public Iterable<Test> findTest() throws IOException {
		return testRepo.findAll();
	}
}

