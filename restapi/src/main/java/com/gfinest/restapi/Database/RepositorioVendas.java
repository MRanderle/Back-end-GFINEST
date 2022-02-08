package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Vendas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioVendas extends JpaRepository<Vendas,Long> {
    
}
