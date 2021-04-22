package com.rogerioreis.apimapeamentoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.apimapeamentoJPA.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
