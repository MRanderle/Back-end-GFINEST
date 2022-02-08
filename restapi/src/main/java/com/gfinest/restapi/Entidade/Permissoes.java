package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permissoes {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nome_permissao;
    private String nmatricula_usuario;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome_permissao() {
        return nome_permissao;
    }
    public void setNome_permissao(String nome_permissao) {
        this.nome_permissao = nome_permissao;
    }
    public String getNmatricula_usuario() {
        return nmatricula_usuario;
    }
    public void setNmatricula_usuario(String nmatricula_usuario) {
        this.nmatricula_usuario = nmatricula_usuario;
    }
}
