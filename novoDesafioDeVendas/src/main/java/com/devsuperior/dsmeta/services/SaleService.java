package com.devsuperior.dsmeta.services;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;

import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public SaleMinDTO findById(Long id) {
		Optional<Sale> result = repository.findById(id);
		Sale entity = result.get();
		return new SaleMinDTO(entity);
	}

	public Page<SaleMinDTO> report(
			String minDateStr,
			String maxDateStr,
			String name,
			Pageable pageable) {

		// Data atual
		LocalDate today = LocalDate.ofInstant(
				Instant.now(),
				ZoneId.systemDefault());

		// Se maxDate não informada → hoje
		LocalDate maxDate = (maxDateStr == null || maxDateStr.isEmpty())
				? today
				: LocalDate.parse(maxDateStr);

		// Se minDate não informada → 1 ano antes
		LocalDate minDate = (minDateStr == null || minDateStr.isEmpty())
				? maxDate.minusYears(1L)
				: LocalDate.parse(minDateStr);

		// Se nome não informado → vazio
		name = (name == null) ? "" : name;

		// Busca no repository
		Page<Sale> result = repository.searchSales(minDate, maxDate, name, pageable);

		// Converte para DTO
		return result.map(SaleMinDTO::new);

	}

		public List<SaleSummaryDTO> summary(
				String minDateStr,
				String maxDateStr) {

			LocalDate today = LocalDate.ofInstant(
					Instant.now(),
					ZoneId.systemDefault());

			LocalDate maxDate = (maxDateStr == null || maxDateStr.isEmpty())
					? today
					: LocalDate.parse(maxDateStr);

			LocalDate minDate = (minDateStr == null || minDateStr.isEmpty())
					? maxDate.minusYears(1L)
					: LocalDate.parse(minDateStr);

			return repository.amountGroupedBySeller(minDate, maxDate);
	}
}
