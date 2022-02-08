package com.gfinest.restapi.Entidade;



public class Pessoajuridica {
    
    private long id_cliente;
    private String cnpj;
    private String  razao_social;
    private String nome_fantasia;
    private long inscricao_estadual;
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    public String getNome_fantasia() {
        return nome_fantasia;
    }
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }
    public long getInscricao_estadual() {
        return inscricao_estadual;
    }
    public void setInscricao_estadual(long inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }
    public int getId() {
        return 0;
    }

}
