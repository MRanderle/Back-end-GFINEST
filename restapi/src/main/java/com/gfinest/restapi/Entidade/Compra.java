package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_nota;
    private long valor_total;
    private String data;
    private long cod_fornecedor;
    private String razao_social;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_nota() {
        return id_nota;
    }
    public void setId_nota(long id_nota) {
        this.id_nota = id_nota;
    }
    public long getValor_total() {
        return valor_total;
    }
    public void setValor_total(long valor_total) {
        this.valor_total = valor_total;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public long getCod_fornecedor() {
        return cod_fornecedor;
    }
    public void setCod_fornecedor(long cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    
}
