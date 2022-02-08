package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cupomfiscal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long  cod_cupom;
    private String  item;
    private String data_venda;
    private long total_item;
    private long total_venda;
    private long cod_produto;
    private String nome_produto;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCod_cupom() {
        return cod_cupom;
    }
    public void setCod_cupom(long cod_cupom) {
        this.cod_cupom = cod_cupom;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getData_venda() {
        return data_venda;
    }
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
    public long getTotal_item() {
        return total_item;
    }
    public void setTotal_item(long total_item) {
        this.total_item = total_item;
    }
    public long getTotal_venda() {
        return total_venda;
    }
    public void setTotal_venda(long total_venda) {
        this.total_venda = total_venda;
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
    public long getPreco_venda() {
        return preco_venda;
    }
    public void setPreco_venda(long preco_venda) {
        this.preco_venda = preco_venda;
    }
    public long getEstoque_quantidade() {
        return estoque_quantidade;
    }
    public void setEstoque_quantidade(long estoque_quantidade) {
        this.estoque_quantidade = estoque_quantidade;
    }
    private long preco_venda;
    private long estoque_quantidade;
    
}
