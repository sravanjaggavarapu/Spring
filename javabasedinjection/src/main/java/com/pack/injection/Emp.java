package com.pack.injection;

public class Emp {
	private int empid;
	private String empName;
	private double empSalary;
	private Address address;
	private Experience exp;
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Experience getExp() {
		return exp;
	}
	public void setExp(Experience exp) {
		this.exp = exp;
	}
	public Emp(int empid, String empName, double empSalary, Address address, Experience exp) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
		this.exp = exp;
	}
	

}
