package com.rogerioreis.apimapeamentoJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.apimapeamentoJPA.entity.Modulo;
import com.rogerioreis.apimapeamentoJPA.repository.ModuloDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST MapeamentoJPA")
@CrossOrigin(origins = "*")
public class ModuloRest {

	@Autowired
	private ModuloDao moduloDao;

	@GetMapping("/modulos")
	@ApiOperation(value = "Retorna uma lista de modulos")
	public List<Modulo> listaModulos() {
		return moduloDao.findAll();
	}

}
