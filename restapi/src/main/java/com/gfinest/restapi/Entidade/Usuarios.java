package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer matricula_usuario;
    private long senha;
    private String acesso;
    private String funcionario_nome;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Integer getMatricula_usuario() {
        return matricula_usuario;
    }
    public void setMatricula_usuario(Integer matricula_usuario) {
        this.matricula_usuario = matricula_usuario;
    }
    public long getSenha() {
        return senha;
    }
    public void setSenha(long senha) {
        this.senha = senha;
    }
    public String getAcesso() {
        return acesso;
    }
    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
    public String getFuncionario_nome() {
        return funcionario_nome;
    }
    public void setFuncionario_nome(String funcionario_nome) {
        this.funcionario_nome = funcionario_nome;
    }


}
