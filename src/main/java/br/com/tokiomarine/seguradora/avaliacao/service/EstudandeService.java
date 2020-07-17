package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

public interface EstudandeService {

	List<Estudante> buscarEstudantes();

	void cadastrarEstudante(@Valid Estudante estudante);

	Optional<Estudante> buscarEstudante(long id);

	void atualizarEstudante(@Valid Estudante estudante);

	void apagarEstudante(@Valid long id);
}
