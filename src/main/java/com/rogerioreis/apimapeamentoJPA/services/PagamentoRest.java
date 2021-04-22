package com.rogerioreis.apimapeamentoJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.apimapeamentoJPA.entity.Pagamento;
import com.rogerioreis.apimapeamentoJPA.repository.PagamentoDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST MapeamentoJPA")
@CrossOrigin(origins = "*")
public class PagamentoRest {

	@Autowired
	private PagamentoDao pagamentoDao;

	@GetMapping("/pagamentos")
	@ApiOperation(value = "Retorna uma lista de pagamentos")
	public List<Pagamento> listaPagamentos() {
		return pagamentoDao.findAll();
	}

}
