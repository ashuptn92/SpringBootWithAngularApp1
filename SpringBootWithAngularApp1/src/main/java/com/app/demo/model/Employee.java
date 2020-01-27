package com.app.demo.model;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	private double empSal;
	private String empEmail;
	private long adhaarNo;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (adhaarNo ^ (adhaarNo >>> 32));
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((empEmail == null) ? 0 : empEmail.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (adhaarNo != other.adhaarNo)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (empEmail == null) {
			if (other.empEmail != null)
				return false;
		} else if (!empEmail.equals(other.empEmail))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(empSal) != Double.doubleToLongBits(other.empSal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", empSal="
				+ empSal + ", empEmail=" + empEmail + ", adhaarNo=" + adhaarNo + "]";
	}
}
