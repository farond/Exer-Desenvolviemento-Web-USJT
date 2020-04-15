package model;

public class Professor implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int matricula;
	private String cpf;
	private String nome;
	private String endereco;
	
	public Professor() {}

	public Professor(int matricula, String cpf, String nome, String endereco) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
