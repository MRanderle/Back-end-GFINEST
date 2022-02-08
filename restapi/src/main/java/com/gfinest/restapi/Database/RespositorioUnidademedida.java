package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Unidademedida;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RespositorioUnidademedida extends JpaRepository<Unidademedida, Long>{ 
    
}
