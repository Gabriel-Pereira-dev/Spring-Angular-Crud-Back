package com.gabriel.springangularcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.springangularcrud.model.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Long>{
}
