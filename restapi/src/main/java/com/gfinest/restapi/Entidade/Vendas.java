package com.gfinest.restapi.Entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long cod_vendas;
    public Date data_vendas;
    public long preco_vendas;
    public long desconto;
    public long preco_total;
    public long cod_produtos;
    public String nome_produtos;
    public long matricula_usuario;
    public long id_pagamento;
    public long id_cliente;
    public long getCod_vendas() {
        return cod_vendas;
    }
    public void setCod_vendas(long cod_vendas) {
        this.cod_vendas = cod_vendas;
    }
    public Date getData_vendas() {
        return data_vendas;
    }
    public void setData_vendas(Date data_vendas) {
        this.data_vendas = data_vendas;
    }
    public long getPreco_vendas() {
        return preco_vendas;
    }
    public void setPreco_vendas(long preco_vendas) {
        this.preco_vendas = preco_vendas;
    }
    public long getDesconto() {
        return desconto;
    }
    public void setDesconto(long desconto) {
        this.desconto = desconto;
    }
    public long getPreco_total() {
        return preco_total;
    }
    public void setPreco_total(long preco_total) {
        this.preco_total = preco_total;
    }
    public long getCod_produtos() {
        return cod_produtos;
    }
    public void setCod_produtos(long cod_produtos) {
        this.cod_produtos = cod_produtos;
    }
    public String getNome_produtos() {
        return nome_produtos;
    }
    public void setNome_produtos(String nome_produtos) {
        this.nome_produtos = nome_produtos;
    }
    public long getMatricula_usuario() {
        return matricula_usuario;
    }
    public void setMatricula_usuario(long matricula_usuario) {
        this.matricula_usuario = matricula_usuario;
    }
    public long getId_pagamento() {
        return id_pagamento;
    }
    public void setId_pagamento(long id_pagamento) {
        this.id_pagamento = id_pagamento;
    }
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public int getId() {
        return 0;
    }
    
}
