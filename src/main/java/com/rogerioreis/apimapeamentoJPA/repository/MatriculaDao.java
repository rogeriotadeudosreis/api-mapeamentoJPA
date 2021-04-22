package com.rogerioreis.apimapeamentoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.apimapeamentoJPA.entity.Matricula;

@Repository
public interface MatriculaDao extends JpaRepository<Matricula, Long> {

}
