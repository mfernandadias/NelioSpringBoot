package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.services.SaleService;

//import java.awt.print.Pageable;
import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	/*@Autowired
	private SaleService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SaleMinDTO> findById(@PathVariable Long id) {
		SaleMinDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}

	@GetMapping(value = "/report")
	public ResponseEntity<?> getReport() {
		// TODO
		return null;
	}

	@GetMapping(value = "/summary")
	public ResponseEntity<?> getSummary() {
		// TODO
		return null;
	} */
	@Autowired
	private SaleService service;

	@GetMapping("/{id}")
	public SaleMinDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	// Endpoint do relatório
	@GetMapping("/report")
	public Page<SaleMinDTO> report(

			// Parâmetros opcionais
			@RequestParam(required = false) String minDate,
			@RequestParam(required = false) String maxDate,
			@RequestParam(required = false) String name,

			// Pageable permite paginação automática
			Pageable pageable) {

		return service.report(minDate, maxDate, name, pageable);
	}

	// Endpoint do sumário
	@GetMapping("/summary")
	public List<SaleSummaryDTO> summary(

			@RequestParam(required = false) String minDate,
			@RequestParam(required = false) String maxDate) {

		return service.summary(minDate, maxDate);
	}
}
