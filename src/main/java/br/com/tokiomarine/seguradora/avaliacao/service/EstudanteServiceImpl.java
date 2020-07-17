package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudandeService {

	@Autowired
	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		List<Estudante> estudantes = new ArrayList<Estudante>();
		repository.findAll().forEach(estudantes::add);
		return estudantes;
	}

	@Override
	public Optional<Estudante> buscarEstudante(long id) {
		return repository.findById(id);
	}

	@Override
	public void apagarEstudante(@Valid long id) {
		repository.deleteById(id);
		
	}

}
