package io.github.danielcaldeir.alunosapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.danielcaldeir.alunosapi.model.TbAluno;
import io.github.danielcaldeir.alunosapi.repository.AlunoRepository;
import io.github.danielcaldeir.alunosapi.service.ValidaCpf;

@RestController
@RequestMapping("/api-alunos/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alRepository;
	
	@GetMapping
	public List<TbAluno> findAll(){
		return alRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TbAluno create(@RequestBody TbAluno aluno) {
		//if (!ValidaCpf.isCPF(aluno.getCpf()) ) {
		//	return HttpStatus.BAD_REQUEST;
		//}
		return alRepository.save(aluno);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		alRepository.deleteById(id);
	}
	
	
}
