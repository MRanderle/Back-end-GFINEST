package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioCliente;

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
public class ClienteRest {
    @Autowired
    private RepositorioCliente repositorio;
    
    @GetMapping
    public List<Cliente>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void Salvar(@RequestBody Cliente cliente){
        
        repositorio.save(cliente);
    }

    @PutMapping
    public void alterar(@RequestBody Cliente cliente){
        if(cliente.getId()>0)
        repositorio.save(cliente);
    }

    @DeleteMapping
    public void deletar(@RequestBody Cliente cliente){
        repositorio.delete(cliente);
    }
}   
