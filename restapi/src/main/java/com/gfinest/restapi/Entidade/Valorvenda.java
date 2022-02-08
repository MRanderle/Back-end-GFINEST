package com.gfinest.restapi.Entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Valorvenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_preco;
    private Integer valor_venda;
    private long cod_produto;
    public long getId_preco() {
        return id_preco;
    }
    public void setId_preco(long id_preco) {
        this.id_preco = id_preco;
    }
    public Integer getValor_venda() {
        return valor_venda;
    }
    public void setValor_venda(Integer valor_venda) {
        this.valor_venda = valor_venda;
    }
    public long getCod_produto() {
        return cod_produto;
    }
    public void setCod_produto(long cod_produto) {
        this.cod_produto = cod_produto;
    }
    public int getId() {
        return 0;
    }
}
