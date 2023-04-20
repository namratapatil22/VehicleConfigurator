package com.vehicleconfig.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Authentication")
public class Authentication 
{
	
	private int authenticationId;
	private String emailId;
	private long phoneNo;
	private String password;
	private String name;
	private String companyName;
	private String companyRegNo;
	private String address;
	
	private Set<Invoice> invoices;
	
	public Authentication() 
	{
		
	}

	public Authentication(String emailId, long phoneNo, String password, String name, String companyName,
			String companyRegNo, String address, Set<Invoice> invoices) {
		super();
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.password = password;
		this.name = name;
		this.companyName = companyName;
		this.companyRegNo = companyRegNo;
		this.address = address;
		this.invoices = invoices;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authentication_id")
	public int getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(int authenticationId) {
		this.authenticationId = authenticationId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRegNo() {
		return companyRegNo;
	}

	public void setCompanyRegNo(String companyRegNo) {
		this.companyRegNo = companyRegNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	 @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "authentication_id", referencedColumnName="authentication_id")
	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

	
	
	
		

}
