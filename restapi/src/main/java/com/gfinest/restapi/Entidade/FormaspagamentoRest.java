package com.gfinest.restapi.Entidade;

import java.util.List;

import com.gfinest.restapi.Database.RepositorioFormaspagamento;

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
public class FormaspagamentoRest {
    @Autowired
    private RepositorioFormaspagamento repositorio;
@GetMapping
    public List<Formaspagamento>listar(){
    return repositorio.findAll();
   }
@PostMapping
   public void salvar(@RequestBody  Formaspagamento Formaspagamento){
       repositorio.save(Formaspagamento);
   }
@PutMapping
   public void alterar(@RequestBody  Formaspagamento formaspagamento){
       if(formaspagamento.getId()>0)
       repositorio.save(formaspagamento);
   }
@DeleteMapping
   public void deletar(@RequestBody  Formaspagamento formaspagamento){
       repositorio.delete(formaspagamento);
   }
}
