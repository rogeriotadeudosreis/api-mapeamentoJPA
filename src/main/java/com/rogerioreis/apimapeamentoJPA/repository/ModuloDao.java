package com.rogerioreis.apimapeamentoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.apimapeamentoJPA.entity.Modulo;

@Repository
public interface ModuloDao extends JpaRepository<Modulo, Long> {

}
