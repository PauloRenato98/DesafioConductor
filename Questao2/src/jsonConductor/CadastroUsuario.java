package jsonConductor;

import java.io.FilterWriter;

import org.json.simple.JSONObject;

public class CadastroUsuario {

	private int id;
	private String cpf;
	private String nome;
	private String dataNascimento;
	private String renda;
	private int numeroDeDependentes;
	
	
	public CadastroUsuario() {
		
	}

	public CadastroUsuario(int id, String cpf, String nome, String dataNascimento, String renda,
			int numeroDeDependentes) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.renda = renda;
		this.numeroDeDependentes = numeroDeDependentes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRenda() {
		return renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	public int getNumeroDeDependentes() {
		return numeroDeDependentes;
	}

	public void setNumeroDeDependentes(int numeroDeDependentes) {
		this.numeroDeDependentes = numeroDeDependentes;
	}

	@Override
	public String toString() {
		return "CadastroUsuario [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", renda=" + renda + ", numeroDeDependentes=" + numeroDeDependentes + "]";
	}
	
	
	
}
