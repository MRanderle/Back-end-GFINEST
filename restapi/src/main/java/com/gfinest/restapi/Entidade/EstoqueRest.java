package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioEstoque;

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
public class EstoqueRest {
    @Autowired
    private RepositorioEstoque repositorio;
    
    @GetMapping
    public List<Estoque>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Estoque estoque){
        repositorio.save(estoque);

    }
    @PutMapping
    public void alterar(@RequestBody Estoque estoque){
        if(estoque.getId()>0)
        repositorio.save(estoque);
    }
    @DeleteMapping
    public void deletar(@RequestBody Estoque estoque){
        repositorio.delete(estoque);
    }
    
}
