package com.unifecaf.services.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.unifecaf.entity.Veiculo;
import com.unifecaf.entity.enums.StatusVeiculo;
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
	public List<VeiculoResponse> founByBetWeemPrice(BigDecimal inicio, BigDecimal fim) {
		 return repository.findByPrecoBetween( inicio, fim)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	}


	

	@Transactional
	@Override
	public VeiculoResponse save(VeiculoRequest request) {
		
		Veiculo entity = mapper.map(request, Veiculo.class);
		
		repository.save(entity);
	
		return mapper.map(entity, VeiculoResponse.class);
	}

	@Override
	public VeiculoResponse foundById(UUID id) {
		
		Veiculo entiity = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Veiculo não encontrado"));
		
		return mapper.map(entiity, VeiculoResponse.class);
		
	}
	
	
	@Override
	@Transactional
	public VeiculoResponse venda(UUID id, StatusVeiculo status) {

	    Veiculo veiculo = repository.findById(id)
	            .orElseThrow(() ->
	                    new RuntimeException(
	                            "Veículo não encontrado: " + id
	                    ));

	    veiculo.setStatusVeiculo(status);
	    Veiculo veiculoAtualizado = repository.save(veiculo);

	    return mapper.map(veiculoAtualizado, VeiculoResponse.class);
	}

	@Override
	public List<VeiculoResponse> founByStatus(StatusVeiculo statuss) {
		 return repository.findByStatusVeiculo(statuss)
		            .stream()
		            .map(entity -> mapper.map(entity, VeiculoResponse.class))
		            .toList();
	}
	
	
	
}
