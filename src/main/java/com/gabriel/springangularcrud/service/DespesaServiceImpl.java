package com.gabriel.springangularcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.springangularcrud.model.Despesa;
import com.gabriel.springangularcrud.repository.DespesaRepository;

@Service
public class DespesaServiceImpl  implements DespesaService{

    @Autowired
    DespesaRepository despesaRepository;

    @Override
    public List<Despesa> findAll(){
        return despesaRepository.findAll();
    }

    @Override
    public Despesa save(Despesa despesa) {
        despesaRepository.save(despesa);
        return despesa;
    };

    @Override
    public Despesa findById(Long id){
        Optional<Despesa> despesaBydId = despesaRepository.findById(id);
        if(despesaBydId.isPresent()){
            return despesaBydId.get();
        }
        return null;
    }

    public void deleteById(Long id){
        despesaRepository.deleteById(id);
    }
}
