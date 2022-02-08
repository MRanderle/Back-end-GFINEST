package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioFuncionario;

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
public class FuncionarioRest {
    @Autowired
    private RepositorioFuncionario repositorio;
    
    @GetMapping
    public List<Funcionario>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Funcionario funcionario){
        repositorio.save(funcionario);  
    }
    @PutMapping
    public void alterar(@RequestBody  Funcionario funcionario){
        if(funcionario.getId()>0)

        repositorio.save(funcionario);

    }
    @DeleteMapping
    public void deletar(@RequestBody  Funcionario funcionario){
        repositorio.delete(funcionario);
    }
}
