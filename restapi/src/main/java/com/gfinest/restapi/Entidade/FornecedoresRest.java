package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioFornecedores;

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
public class FornecedoresRest {
    
    @Autowired
    private RepositorioFornecedores repositorio;


    @GetMapping
    public List<Fornecedores>lista(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody  Fornecedores fornecedores){
        repositorio.save(fornecedores);
    
    }
    @PutMapping
    public void alterar(@RequestBody  Fornecedores fornecedores){
        if(fornecedores.getId()>0)
        repositorio.save(fornecedores);
    }

    @DeleteMapping
    public void deletar(@RequestBody  Fornecedores fornecedores){
        repositorio.delete(fornecedores);
    }
}
