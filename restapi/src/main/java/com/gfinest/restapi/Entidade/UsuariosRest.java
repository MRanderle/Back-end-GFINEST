package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioUsuarios;

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
public class UsuariosRest {
    

    @   Autowired
     private RepositorioUsuarios repositorio;
     
     @GetMapping
     public List<Usuarios>listar(){
         return repositorio.findAll();
     }
     @PostMapping
     public void salvar(@RequestBody  Usuarios usuarios){
         repositorio.save(usuarios);
     }
    @PutMapping
     public void alterar(@RequestBody Usuarios usuarios){
         if(usuarios.getId()>0)
         repositorio.save(usuarios);
         
     }
     @DeleteMapping
     public void deletar(@RequestBody Usuarios usuarios){
         repositorio.delete(usuarios);
     }
}
