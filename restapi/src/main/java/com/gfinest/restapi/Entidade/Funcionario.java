package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Funcionario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_funcionario;
   private String nome;
   private long cpf;
   private String endereco;
   private long telefone;
   private String email;
   private String Funcao;
   private long data_admissao;
   private long data_demissao;
   private long cod_venda;
   public long getId_funcionario() {
    return id_funcionario;
}
public void setId_funcionario(long id_funcionario) {
    this.id_funcionario = id_funcionario;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public long getCpf() {
    return cpf;
}
public void setCpf(long cpf) {
    this.cpf = cpf;
}
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public long getTelefone() {
    return telefone;
}
public void setTelefone(long telefone) {
    this.telefone = telefone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getFuncao() {
    return Funcao;
}
public void setFuncao(String funcao) {
    Funcao = funcao;
}
public long getData_admissao() {
    return data_admissao;
}
public void setData_admissao(long data_admissao) {
    this.data_admissao = data_admissao;
}
public long getData_demissao() {
    return data_demissao;
}
public void setData_demissao(long data_demissao) {
    this.data_demissao = data_demissao;
}
public long getCod_venda() {
    return cod_venda;
}
public void setCod_venda(long cod_venda) {
    this.cod_venda = cod_venda;
}
public long getMatricula() {
    return matricula;
}
public void setMatricula(long matricula) {
    this.matricula = matricula;
}
private long matricula;
public int getId() {
    return 0;
}

}
