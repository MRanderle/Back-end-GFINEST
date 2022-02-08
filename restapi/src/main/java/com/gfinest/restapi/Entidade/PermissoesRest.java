package com.gfinest.restapi.Entidade;

import java.util.List;



import com.gfinest.restapi.Database.RepositorioPermissoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class PermissoesRest {
    
    @Autowired
    private RepositorioPermissoes repositorio;
    
    @GetMapping
    public List<Permissoes>listar(){
        return repositorio.findAll();
    }
    
    public void salvar(@RequestBody  Permissoes permissoes){
        repositorio.save(permissoes);

    }

    @PostMapping
    public void alterar(@RequestBody Permissoes permissoes){
        if(permissoes.getId()>0)
        repositorio.save(permissoes);

    }
    
    @DeleteMapping
    public void deletar(@RequestBody Permissoes permissoes){
        repositorio.delete(permissoes);
    }
}
