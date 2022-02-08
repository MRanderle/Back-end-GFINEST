package com.gfinest.restapi.Entidade;



public class NFvendas {
    
    private long Id;
    private long id_nota;
    private String data;
    private long valor_total;
    private long endereco_inativo;
    private long cod_produto;
    private String nome_produto;
    private long id_funcionario;
    private long id_cliente;
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public long getId_nota() {
        return id_nota;
    }
    public void setId_nota(long id_nota) {
        this.id_nota = id_nota;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public long getValor_total() {
        return valor_total;
    }
    public void setValor_total(long valor_total) {
        this.valor_total = valor_total;
    }
    public long getEndereco_inativo() {
        return endereco_inativo;
    }
    public void setEndereco_inativo(long endereco_inativo) {
        this.endereco_inativo = endereco_inativo;
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
    public long getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
}
