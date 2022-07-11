package com.jbk.student.model;

public class Branch {
	private int branchId;
	private String branchName;
	private int branchCode;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Branch(int branchId, String branchName, int branchCode) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCode = branchCode;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode + "]";
	}
	
	

}
