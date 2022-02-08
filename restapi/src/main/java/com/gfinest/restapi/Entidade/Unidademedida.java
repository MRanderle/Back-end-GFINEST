package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unidademedida {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_unidade;
    private String nome_unidade;
    public long getId_unidade() {
        return id_unidade;
    }
    public void setId_unidade(long id_unidade) {
        this.id_unidade = id_unidade;
    }
    public String getNome_unidade() {
        return nome_unidade;
    }
    public void setNome_unidade(String nome_unidade) {
        this.nome_unidade = nome_unidade;
    }
    public int getId() {
        return 0;
    }

}
