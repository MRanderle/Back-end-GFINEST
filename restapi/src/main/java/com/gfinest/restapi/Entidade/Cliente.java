package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Cliente {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long Id;
   private long Ind_pessoa;
   private long Cep;
   private long Cpf;
   private String Endereco;
   private long Telefone;
   private String Email;
   private long Cnpj;
   private String Razao_social;
   private long Cod_vendas;
public long getId() {
    return Id;
}
public void setId(long id) {
    Id = id;
}
public long getInd_pessoa() {
    return Ind_pessoa;
}
public void setInd_pessoa(long ind_pessoa) {
    Ind_pessoa = ind_pessoa;
}
public long getCep() {
    return Cep;
}
public void setCep(long cep) {
    Cep = cep;
}
public long getCpf() {
    return Cpf;
}
public void setCpf(long cpf) {
    Cpf = cpf;
}
public String getEndereco() {
    return Endereco;
}
public void setEndereco(String endereco) {
    Endereco = endereco;
}
public long getTelefone() {
    return Telefone;
}
public void setTelefone(long telefone) {
    Telefone = telefone;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    Email = email;
}
public long getCnpj() {
    return Cnpj;
}
public void setCnpj(long cnpj) {
    Cnpj = cnpj;
}
public String getRazao_social() {
    return Razao_social;
}
public void setRazao_social(String razao_social) {
    Razao_social = razao_social;
}
public long getCod_vendas() {
    return Cod_vendas;
}
public void setCod_vendas(long cod_vendas) {
    Cod_vendas = cod_vendas;
}

    
}
