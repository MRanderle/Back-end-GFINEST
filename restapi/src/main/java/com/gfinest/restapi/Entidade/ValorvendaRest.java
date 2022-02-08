package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioValorvenda;

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
public class ValorvendaRest {
     
    @Autowired
    private RepositorioValorvenda repositorio;

    @GetMapping
    public List<Valorvenda>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Valorvenda valorvenda){
        repositorio.save(valorvenda);
    }
    @PutMapping
    public void alterar(@RequestBody  Valorvenda valorvenda){
        if(valorvenda.getId()>0)
        repositorio.save(valorvenda);
    }
    @DeleteMapping
    public void deletar(@RequestBody  Valorvenda valorvenda){
      repositorio.delete(valorvenda);
    }
}
