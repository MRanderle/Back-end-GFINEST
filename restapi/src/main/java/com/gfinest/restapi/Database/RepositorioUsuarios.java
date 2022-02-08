package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository<Usuarios, Long> {
    
}
