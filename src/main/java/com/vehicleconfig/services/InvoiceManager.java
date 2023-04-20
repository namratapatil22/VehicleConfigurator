package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;


import com.vehicleconfig.entities.Invoice;

public interface InvoiceManager 
{
	void add(Invoice inv);
	List<Invoice> getAll();
	void delete (int id);
	void update(Invoice inv,int id);
	List<?> get(int id);

}
