package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioCupomfiscal;

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
public class CupomfiscalRest {
    @Autowired
    private RepositorioCupomfiscal repositorio;
    
    @GetMapping
    public List<Cupomfiscal>listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody  Cupomfiscal cupomfiscal){
        repositorio.save(cupomfiscal);
    }
    
    @PutMapping
    public void alterar(@RequestBody   Cupomfiscal cupomfiscal){
        if(cupomfiscal.getId()>0)
        repositorio.save(cupomfiscal);
    }
    
    @DeleteMapping
    public void deletar(@RequestBody   Cupomfiscal cupomfiscal){
        repositorio.delete(cupomfiscal);
    }
}
