package com.pack.javabased;

public class Customer {
	private Integer customerId;
	private String customerFname;
	private String customerLname;
	private String customerEmail;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFname=" + customerFname + ", customerLname="
				+ customerLname + ", customerEmail=" + customerEmail + "]";
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFname() {
		return customerFname;
	}

	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	public String getCustomerLname() {
		return customerLname;
	}

	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
