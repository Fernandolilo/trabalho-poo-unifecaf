package com.unifecaf.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import com.unifecaf.entity.enums.StatusVeiculo;
import com.unifecaf.entity.requesty.VeiculoRequest;
import com.unifecaf.entity.response.VeiculoResponse;

public interface VeicleService {

	List<VeiculoResponse> founByAno (int ano);
	List<VeiculoResponse> founByMarca (String marca);
	List<VeiculoResponse> founByModelo (String modelo);
	List<VeiculoResponse> founBetWeemByAno (int inicio, int fim);
	List<VeiculoResponse> founByBetWeemPrice (BigDecimal precoInit,BigDecimal precoFim );
	
	VeiculoResponse venda (UUID id, StatusVeiculo statuss);
	
	VeiculoResponse foundById (UUID id);
	VeiculoResponse save (VeiculoRequest request);
}
