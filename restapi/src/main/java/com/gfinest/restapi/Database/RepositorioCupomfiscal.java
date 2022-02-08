package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Cupomfiscal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCupomfiscal extends JpaRepository<Cupomfiscal,Long>{
    
}
