package com.gfinest.restapi.Database;

import com.gfinest.restapi.Entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Long>{
    
}
