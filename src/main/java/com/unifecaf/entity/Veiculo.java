package com.unifecaf.entity;

import java.math.BigDecimal;
import java.util.UUID;

import com.unifecaf.entity.enums.StatusVeiculo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String cor;
	private int ano;
	private String modelo;
	private String fabricante;
	private BigDecimal preco;
	private Integer odometro;
	
	@NotNull(message = "O status do veiculo é obrigatório")
	    @Enumerated(EnumType.STRING)
	    @Column(
	        name = "STATUS_VEICULO",
	        nullable = false
	    )
	    @Builder.Default
	    private StatusVeiculo statusVeiculo = StatusVeiculo.DISPONIVEL;
	
}
