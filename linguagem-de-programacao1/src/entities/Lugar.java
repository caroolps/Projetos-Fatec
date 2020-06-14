package entities;

public class Lugar {

	private String nome;
	private Integer cpf;
	private String pagamento;
	private String destino;
	public Lugar(String nome, Integer cpf, String pagamento, String destino) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.pagamento = pagamento;
		this.destino = destino;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
}
