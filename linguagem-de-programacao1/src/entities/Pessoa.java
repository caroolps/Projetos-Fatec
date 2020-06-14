package entities;

public class Pessoa {

	private String titular;
	private Integer cpf;
	private String agencia;
	private Integer numero;
	
	public Pessoa(String titular, Integer cpf, String agencia, Integer numero) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.agencia = agencia;
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	
	
}
