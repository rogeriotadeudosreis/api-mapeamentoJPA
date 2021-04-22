package com.rogerioreis.apimapeamentoJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.apimapeamentoJPA.entity.Curso;
import com.rogerioreis.apimapeamentoJPA.repository.CursoDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST MapeamentoJPA")
@CrossOrigin(origins = "*")
public class CursoRest {

	@Autowired
	private CursoDao cursoDao;

	@GetMapping("/cursos")
	@ApiOperation(value = "Retorna uma lista de cursos")
	public List<Curso> listaCursos() {
		return cursoDao.findAll();
	}

}
