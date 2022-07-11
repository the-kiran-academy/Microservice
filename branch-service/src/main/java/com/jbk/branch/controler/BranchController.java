package com.jbk.branch.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.branch.entity.Branch;
import com.jbk.branch.service.BranchService;


@RestController
@RequestMapping(value = "/branch")
public class BranchController {
	@Autowired
	private BranchService service;

	@PostMapping(value = "/saveBranch")
	public ResponseEntity<String> saveBranch(@RequestBody Branch branch) {
		boolean b = service.saveBranch(branch);
		if(b) {
			return new ResponseEntity<String>("Saved !!",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>(" Not Saved !!",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

	}
	
	@GetMapping(value = "/getBranch")
	public ResponseEntity<Branch> getBranch(@RequestParam int branchId){
		
		Branch branch=service.getBranch(branchId);
		if(branch!=null) {
			return new ResponseEntity<Branch>(branch,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Branch>(branch,HttpStatus.NO_CONTENT);
		}
	
		
	}
}
