package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Relatorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id_cliente;
    private String lucro;
    private String prejuizo;
    private String reserva;
    private long cod_pessoa_fisica;
    private String nome_pessoa_fisica;
    private long cod_pessoa_juridica;
    private String razao_social;
    private long cod_produto;
    private String nome_produto;
    public long getId_cliente() {
        return Id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        Id_cliente = id_cliente;
    }
    public String getLucro() {
        return lucro;
    }
    public void setLucro(String lucro) {
        this.lucro = lucro;
    }
    public String getPrejuizo() {
        return prejuizo;
    }
    public void setPrejuizo(String prejuizo) {
        this.prejuizo = prejuizo;
    }
    public String getReserva() {
        return reserva;
    }
    public void setReserva(String reserva) {
        this.reserva = reserva;
    }
    public long getCod_pessoa_fisica() {
        return cod_pessoa_fisica;
    }
    public void setCod_pessoa_fisica(long cod_pessoa_fisica) {
        this.cod_pessoa_fisica = cod_pessoa_fisica;
    }
    public String getNome_pessoa_fisica() {
        return nome_pessoa_fisica;
    }
    public void setNome_pessoa_fisica(String nome_pessoa_fisica) {
        this.nome_pessoa_fisica = nome_pessoa_fisica;
    }
    public long getCod_pessoa_juridica() {
        return cod_pessoa_juridica;
    }
    public void setCod_pessoa_juridica(long cod_pessoa_juridica) {
        this.cod_pessoa_juridica = cod_pessoa_juridica;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    public long getCod_produto() {
        return cod_produto;
    }
    public void setCod_produto(long cod_produto) {
        this.cod_produto = cod_produto;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public int getId() {
        return 0;
    }
}
