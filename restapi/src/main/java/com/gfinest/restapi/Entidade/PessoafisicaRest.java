package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioPessoafisica;

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
public class PessoafisicaRest {
    
    @Autowired
    private RepositorioPessoafisica repositorio;


    @GetMapping
    public List<Pessoafisica>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Pessoafisica pessoafisica){
        repositorio.save(pessoafisica);
    
    }
    @PutMapping
    public void alterar(@RequestBody Pessoafisica pessoafisica){
        if(pessoafisica.getId()>0)
        repositorio.save(pessoafisica);
    }
    @DeleteMapping
    public void deletar(@RequestBody Pessoafisica pessoafisica){
        repositorio.delete(pessoafisica);
    }
}
