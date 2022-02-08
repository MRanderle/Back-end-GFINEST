package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoafisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long id_cliente;
  private String nome;
  private String rg;
  private String sexo;
  private long data_nascimento;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public long getId_cliente() {
    return id_cliente;
}
public void setId_cliente(long id_cliente) {
    this.id_cliente = id_cliente;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getRg() {
    return rg;
}
public void setRg(String rg) {
    this.rg = rg;
}
public String getSexo() {
    return sexo;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}
public long getData_nascimento() {
    return data_nascimento;
}
public void setData_nascimento(long data_nascimento) {
    this.data_nascimento = data_nascimento;
}

  
  
  
  

}
