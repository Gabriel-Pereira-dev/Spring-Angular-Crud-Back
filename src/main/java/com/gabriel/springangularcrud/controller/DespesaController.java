package com.gabriel.springangularcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.springangularcrud.model.Despesa;
import com.gabriel.springangularcrud.service.DespesaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class DespesaController {
    
    @Autowired
    DespesaService despesaService;

    @GetMapping("/despesas")
    public ResponseEntity<List<Despesa>> pegarTodasDespesas(){
        List<Despesa> despesas = despesaService.findAll();
        return new ResponseEntity<List<Despesa>>(despesas,HttpStatus.OK);
    }

    @GetMapping("/despesas/{id}")
    public ResponseEntity<Despesa> pegarDespesaPorId(@PathVariable("id") Long id){
        Despesa despesa = despesaService.findById(id);
        return new ResponseEntity<Despesa>(despesa,HttpStatus.OK);
    }

    @DeleteMapping("/despesas/{id}")
    public ResponseEntity<Despesa> apagarDespesaPorId(@PathVariable("id") Long id){
        despesaService.deleteById(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/despesas")
    public ResponseEntity<Despesa> salvarDespesa(@RequestBody Despesa despesa){
        Despesa despesaSalva = despesaService.save(despesa);
        return new ResponseEntity<Despesa>(despesaSalva,HttpStatus.OK);
    }
}
