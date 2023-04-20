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
@Table(name="invoice")
public class Invoice
{
	private int invoiceId;
	private double price;
	private int authenticationId;
	private int modelId;
		
	
	//private Set<InvoiceDetail> invoiceDetails;
	
	public Invoice()
	{
		
	}

	public Invoice(double price,int authenticationId, int modelId) {
		super();
		this.price = price;
		this.authenticationId=authenticationId;
		//this.invoiceDetails = invoiceDetails;
		this.modelId=modelId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="invoice_id")
	

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name="authentication_id")
	public int getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(int authenticationId) {
		this.authenticationId = authenticationId;
	}

	@Column(name="model_id")
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	
	
	
	
	
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="invoice_id", referencedColumnName="invoice_id")
	public Set<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}*/

	/*public void setInvoiceDetails(Set<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}*/
	
	
	
	

}
