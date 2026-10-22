package com.unifecaf.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifecaf.entity.Veiculo;

@Repository
public interface VeicleRepository extends JpaRepository<Veiculo, UUID> {
	
	  List<Veiculo> findByAno(int ano);
	  
	  List<Veiculo> findByFabricante(String fabricante);

	  List<Veiculo> findByModelo(String modelo);
	  
	  List<Veiculo> findByAnoBetween(int inicio, int fim);
	  
	  List<Veiculo> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);


	  
}
