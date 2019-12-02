package desafioConductor;


public class UsuarioComum {

	private int id = 9873;
	private String cpf = "11122244477";
	private String nome = "José Bonifácio";
	private String dataNascimento = "2019-11-26";
	private double renda = 987.35;
	private int numeroDeDependentes = 2;

	
	
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

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public int getNumeroDeDependentes() {
		return numeroDeDependentes;
	}

	public void setNumeroDeDependentes(int numeroDeDependentes) {
		this.numeroDeDependentes = numeroDeDependentes;
	}
}
