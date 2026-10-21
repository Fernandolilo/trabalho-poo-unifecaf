package com.unifecaf.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private LocalDate ano;
	private String modelo;
	private String fabricante;
	private double potencia;
	
}
