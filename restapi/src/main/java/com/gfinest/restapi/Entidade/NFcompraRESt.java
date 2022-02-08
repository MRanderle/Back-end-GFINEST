package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioNFcompra;

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
public class NFcompraRESt {
    @Autowired
    private RepositorioNFcompra repositorio;
    @GetMapping
    public List<NFcompras>listar(){
        return repositorio.findAll();
    }
    
    @PostMapping
    public void salvar(@RequestBody  NFcompras nFcompras){
        repositorio.save(nFcompras);
    }
    @PutMapping
    public void alterar(@RequestBody   NFcompras nFcompras){
        if(nFcompras.getId()>0)
        repositorio.save(nFcompras);
    }
    @DeleteMapping
    public void deletar(@RequestBody   NFcompras nFcompras){
       repositorio.delete(nFcompras);
    }
}
