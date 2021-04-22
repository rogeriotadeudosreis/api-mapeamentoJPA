package com.rogerioreis.apimapeamentoJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.apimapeamentoJPA.entity.Aluno;
import com.rogerioreis.apimapeamentoJPA.repository.AlunoDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST MapeamentoJPA")
@CrossOrigin(origins = "*")
public class AlunoRest {

	@Autowired
	private AlunoDao alunoDao;

	@GetMapping("/alunos")
	@ApiOperation(value = "Retorna uma lista de Alunos")
	public List<Aluno> listaAlunos() {
		return alunoDao.findAll();
	}

}
