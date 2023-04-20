package com.vehicleconfig.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoiceDetail")
public class InvoiceDetail
{
	
	private int invoiceDetailId;
	private String compDesc;
	
	public InvoiceDetail()
	{
		
	}

	public InvoiceDetail(String compDesc) {
	
		this.compDesc = compDesc;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="invoiceDetail_id")

	public int getInvoiceDetailId() {
		return invoiceDetailId;
	}

	public void setInvoiceDetailId(int invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	
	
	
	
	
	
}
