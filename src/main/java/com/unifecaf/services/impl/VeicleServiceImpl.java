package com.unifecaf.services.impl;

import java.math.BigDecimal;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.unifecaf.entity.Veiculo;
import com.unifecaf.entity.requesty.VeiculoRequest;
import com.unifecaf.entity.response.VeiculoResponse;
import com.unifecaf.repositories.VeicleRepository;
import com.unifecaf.services.VeicleService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VeicleServiceImpl implements VeicleService{
	
	private final VeicleRepository repository;
	private final ModelMapper mapper;

	
	@Override
	public List<VeiculoResponse> founByAno(int ano) {
		  return repository.findByAno(ano)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	}

	@Override
	public List<VeiculoResponse> founByMarca(String fabricante) {
		 return repository.findByFabricante(fabricante)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	}

	@Override
	public List<VeiculoResponse> founByModelo(String modelo) {
		 return repository.findByModelo(modelo)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	}

	@Override
	public List<VeiculoResponse> founBetWeemByAno(int inicio, int fim) {
		 return repository.findByAnoBetween( inicio, fim)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	
	}

	@Override
	public List<VeiculoResponse> founByBeetWeemPrice(BigDecimal precoInit, BigDecimal precoFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo update(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public VeiculoResponse save(VeiculoRequest request) {
		
		Veiculo entity = mapper.map(request, Veiculo.class);
		
		repository.save(entity);
		
		// TODO Auto-generated method stub
		return mapper.map(entity, VeiculoResponse.class);
	}

}
