package com.unifecaf.entity.requesty;

import java.math.BigDecimal;

import com.unifecaf.entity.enums.StatusVeiculo;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VeiculoRequest {
	
	private String cor;
	private int ano;
	private String modelo;
	private String fabricante;
	private BigDecimal preco;
	private Integer odometro;
    @Enumerated(EnumType.STRING)
	private StatusVeiculo status;

}
