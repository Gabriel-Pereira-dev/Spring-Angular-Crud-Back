package com.gabriel.springangularcrud.service;

import java.util.List;

import com.gabriel.springangularcrud.model.Despesa;

public interface DespesaService {
    
    List<Despesa> findAll();

    Despesa save(Despesa despesa);

    Despesa findById(Long id);

    void deleteById(Long id);
}
