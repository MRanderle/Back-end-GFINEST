package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioNFvendas;

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

public class NFvendasRest {
    @Autowired
    private RepositorioNFvendas repositorio;
@GetMapping
    public List<NFvendas>listar(){
        return repositorio.findAll();
    }
@PostMapping
    public void salvar(@RequestBody NFvendas nFvendas){
        repositorio.save(nFvendas);
    }
@PutMapping
    public void alterar(@RequestBody NFvendas nFvendas){
        if(nFvendas.getId()>0)
        repositorio.save(nFvendas);
    }
@DeleteMapping
    public void deletar(@RequestBody NFvendas nFvendas){
        repositorio.delete(nFvendas);
    }
}
