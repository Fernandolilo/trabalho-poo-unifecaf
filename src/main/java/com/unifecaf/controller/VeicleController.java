package com.unifecaf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
