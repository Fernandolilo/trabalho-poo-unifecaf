package com.unifecaf.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifecaf.entity.Veiculo;

@Repository
public interface VeicleRepository extends JpaRepository<Veiculo, UUID> {

}
