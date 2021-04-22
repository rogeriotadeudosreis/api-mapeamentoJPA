package com.rogerioreis.apimapeamentoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.apimapeamentoJPA.entity.Pagamento;

@Repository
public interface PagamentoDao extends JpaRepository<Pagamento, Long> {

}
