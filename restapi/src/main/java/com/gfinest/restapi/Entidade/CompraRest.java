package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioCompra;

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
public class CompraRest {
    @Autowired

    private RepositorioCompra repositorio;
     
    @GetMapping
    public List<Compra>listar(){
        return repositorio.findAll();

    }
    @PostMapping
    public void save(@RequestBody Compra compra ){
        repositorio.save(compra);
    }
    @PutMapping
    public void alterar(@RequestBody Compra compra){
        if(compra.getId()>0)
        repositorio.save(compra);
    }
    @DeleteMapping
    public void deletar(@RequestBody Compra compra){
        repositorio.delete(compra);
    }
    
}
