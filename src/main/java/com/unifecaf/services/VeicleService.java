package com.unifecaf.services;

import java.math.BigDecimal;
import java.util.List;

import com.unifecaf.entity.Veiculo;
import com.unifecaf.entity.requesty.VeiculoRequest;
import com.unifecaf.entity.response.VeiculoResponse;

public interface VeicleService {

	List<VeiculoResponse> founByAno (int ano);
	List<VeiculoResponse> founByMarca (String marca);
	List<VeiculoResponse> founByModelo (String modelo);
	List<VeiculoResponse> founBeetWeemByAno (int inicio, int fim);
	List<VeiculoResponse> founByBeetWeemPrice (BigDecimal precoInit,BigDecimal precoFim );
	
	Veiculo update (String status);
	VeiculoResponse save (VeiculoRequest request);
}
