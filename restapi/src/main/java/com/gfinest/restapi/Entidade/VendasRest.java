package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioVendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VendasRest {
     @Autowired
    private RepositorioVendas repositorio;

    @GetMapping
    public List<Vendas>listar(){
        return repositorio.findAll();
    
    }
    @PostMapping
    public void salvar(@RequestBody  Vendas vendas){
        repositorio.save(vendas);

    }
    @PutMapping
    public void alterar(@RequestBody  Vendas vendas){
        if(vendas.getId()>0)
        repositorio.save(vendas);
    }
    @DeleteMapping
    public void deletar(@RequestBody  Vendas vendas){
        repositorio.delete(vendas);
    }
}
