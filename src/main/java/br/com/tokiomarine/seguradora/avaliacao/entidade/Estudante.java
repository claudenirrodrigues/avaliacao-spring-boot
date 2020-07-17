package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@NotNull(message = "Nome é obrigatório")
	@Column(name = "NOME")
	private String nome;
	@NotNull(message = "Email é obrigatório")
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TELEFONE")
	private String telefone;
	@NotNull(message = "Matricula é obrigatório")
	@Column(name = "MATRICULA")
	private Integer matricula;
	@Column(name = "CURSO")
	private String curso;
		
		
	
	public Estudante() {
	}

	public Estudante(long id, String nome, String email, String telefone, Integer matricula, String curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.matricula = matricula;
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email=" + email + '\'' +
                ", telefone=" + telefone + '\'' +
                ", matricula=" + matricula.toString() + '\'' +
                ", curso=" + curso +
                '}';
	}
	
}
