package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("""
        SELECT s FROM Sale s
        WHERE s.date BETWEEN :minDate AND :maxDate
        AND LOWER(s.seller.name) LIKE LOWER(CONCAT('%', :name, '%'))
    """)
    Page<Sale> searchSales(
            @Param("minDate") LocalDate minDate,
            @Param("maxDate") LocalDate maxDate,
            @Param("name") String name,
            Pageable pageable
    );

    @Query("""
        SELECT new com.devsuperior.dsmeta.dto.SaleSummaryDTO(
            s.seller.name,
            SUM(s.amount)
        )
        FROM Sale s
        WHERE s.date BETWEEN :minDate AND :maxDate
        GROUP BY s.seller.name
    """)
    List<SaleSummaryDTO> amountGroupedBySeller(
            @Param("minDate") LocalDate minDate,
            @Param("maxDate") LocalDate maxDate
    );

}
