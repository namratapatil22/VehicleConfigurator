package com.vehicleconfig.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.Invoice;

@Repository
@Transactional
public interface InvoiceRepository  extends JpaRepository<Invoice,Integer> {
	
	
	//List<Map<String,Object>>findInvoice(@Param("id")int id);

}
