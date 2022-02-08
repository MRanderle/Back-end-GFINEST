package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cod_fornecedor;
    private  String telefone;
    private String endereço;
    private String razao_social;
    private  String nome_fantasia;
    private  String cnpj;
    private String email;
    private long id_nota;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCod_fornecedor() {
        return cod_fornecedor;
    }
    public void setCod_fornecedor(long cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    public String getNome_fantasia() {
        return nome_fantasia;
    }
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId_nota() {
        return id_nota;
    }
    public void setId_nota(long id_nota) {
        this.id_nota = id_nota;
    }

}
