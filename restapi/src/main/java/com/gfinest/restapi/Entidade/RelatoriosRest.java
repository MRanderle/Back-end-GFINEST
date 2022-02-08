package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioRelatorios;

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
public class RelatoriosRest {
    
    @Autowired
    private RepositorioRelatorios repositorio;
    @GetMapping
    public List<Relatorios>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody  Relatorios relatorios){
            repositorio.save(relatorios);
    }
    @PutMapping
    public void alterar(@RequestBody   Relatorios relatorio){
        if(relatorio.getId()>0)
        repositorio.save(relatorio);
    }
    @DeleteMapping
    public void deletar(@RequestBody   Relatorios relatorios){
        repositorio.delete(relatorios);
    }
}
