package com.rogerioreis.apimapeamentoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.apimapeamentoJPA.entity.Aluno;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, Long> {

}
