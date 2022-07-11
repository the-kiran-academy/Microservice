package com.jbk.branch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.branch.dao.BranchDao;
import com.jbk.branch.entity.Branch;

@Service
public class BranchService_impl implements BranchService{

	@Autowired
	private BranchDao dao;
	@Override
	public boolean saveBranch(Branch branch) {
		
		return dao.saveBranch(branch);
	}

	@Override
	public Branch getBranch(int branchId) {
		
		return dao.getBranch(branchId);
	}

}
