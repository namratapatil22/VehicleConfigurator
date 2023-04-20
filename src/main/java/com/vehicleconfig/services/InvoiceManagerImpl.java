package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.Invoice;
import com.vehicleconfig.repositories.InvoiceRepository;

@Service
public class InvoiceManagerImpl implements InvoiceManager
{
	@Autowired
	InvoiceRepository repository;

	@Override
	public void add(Invoice inv) {
		repository.save(inv);
		
	}

	@Override
	public List<Invoice> getAll() {
		
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(Invoice inv, int id) {
	
		
	}

	@Override
	public List<?> get(int id) {
	
		return null;
	}
	

}
