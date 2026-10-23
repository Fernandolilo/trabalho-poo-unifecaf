package com.unifecaf.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifecaf.entity.enums.StatusVeiculo;
import com.unifecaf.entity.requesty.VeiculoRequest;
import com.unifecaf.entity.response.VeiculoResponse;
import com.unifecaf.services.VeicleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
public class VeicleController {
	
	private final VeicleService service;
	
	@PostMapping
	public ResponseEntity<VeiculoResponse> create (@Valid @RequestBody VeiculoRequest request){
		VeiculoResponse create = service.save(request);
		 return ResponseEntity
	                .status(HttpStatus.CREATED)
	                .body(create);
	}
	
	@PutMapping(value = "/venda/id/{id}status/{status}")
	public ResponseEntity<VeiculoResponse> venda (@Valid @PathVariable UUID id,  StatusVeiculo status){
		VeiculoResponse create = service.venda(id, status);
		 return ResponseEntity
	                .status(HttpStatus.CREATED)
	                .body(create);
	}
	
	 @GetMapping(value = "ano/{ano}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByAno(@PathVariable int ano) {

	        return ResponseEntity.ok(service.founByAno(ano));
	    }
	 
	 @GetMapping(value = "fabricante/{fabricante}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByMarca(@PathVariable String fabricante) {

	        return ResponseEntity.ok(service.founByMarca(fabricante));
	    }
	 
	 @GetMapping(value = "disponibilidade/{status}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByMarca(@PathVariable StatusVeiculo status) {

	        return ResponseEntity.ok(service.founByStatus(status));
	    }
	 
	 @GetMapping(value = "modelo/{modelo}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByModelo(@PathVariable String modelo) {

	        return ResponseEntity.ok(service.founByModelo(modelo));
	    }
	 
	 @GetMapping("/inicio/{inicio}/fim/{fim}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByBetWeen(@PathVariable int inicio, int fim) {

	        return ResponseEntity.ok(service.founBetWeemByAno(inicio, fim));
	    }
	 
	 @GetMapping("preco/inicio/{inicio}/fim/{fim}")
	    public ResponseEntity<List<VeiculoResponse>> findAllByPriceBetWeen(@PathVariable BigDecimal inicio, BigDecimal fim) {

	        return ResponseEntity.ok(service.founByBetWeemPrice(inicio, fim));
	    }

}
