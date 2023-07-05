package com.htmlteste.pagina.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htmlteste.pagina.entidade.contato;

public interface RepositorioContato extends JpaRepository <contato, Long> {
    
}
