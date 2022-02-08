package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioProdutos;

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
public class ProdutosRest {
    @Autowired
    private RepositorioProdutos repositorio;

    @GetMapping
    public List<Produtos>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Produtos produtos){
        repositorio.save(produtos);
    }
    @PutMapping
    public void alterar(@RequestBody Produtos produtos){
        if(produtos.getId()>0)
        repositorio.save(produtos);
    }
    @DeleteMapping
    public void deletar(@RequestBody  Produtos produtos){
        repositorio.delete(produtos);
    }
    }

    

