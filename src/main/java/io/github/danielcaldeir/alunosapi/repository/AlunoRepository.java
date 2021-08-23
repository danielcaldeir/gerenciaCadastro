package io.github.danielcaldeir.alunosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.danielcaldeir.alunosapi.model.TbAluno;

@Repository
public interface AlunoRepository extends JpaRepository<TbAluno, Integer>{

}
