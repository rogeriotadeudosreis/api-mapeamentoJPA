package com.rogerioreis.apimapeamentoJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.apimapeamentoJPA.entity.Matricula;
import com.rogerioreis.apimapeamentoJPA.repository.MatriculaDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST MapeamentoJPA")
public class MatriculaRest {

	@Autowired
	private MatriculaDao matriculaDao;

	@GetMapping("/matriculas")
	@ApiOperation(value = "Retorna uma lista de matriculas")
	public List<Matricula> listaMatriculas() {
		return matriculaDao.findAll();
	}

}
