package com.gfinest.restapi.Entidade;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id_estoque;
    
    public long Quantidade;
    
    public long getId_estoque() {
        return Id_estoque;
    }

    public void setId_estoque(long id_estoque) {
        Id_estoque = id_estoque;
    }

    public long getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(long quantidade) {
        Quantidade = quantidade;
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

    public long getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(long cod_venda) {
        this.cod_venda = cod_venda;
    }

    public long cod_produto;
    
    public String nome_produto;
    
    public long cod_venda;

    public int getId() {
        return 0;
    }
    
}
