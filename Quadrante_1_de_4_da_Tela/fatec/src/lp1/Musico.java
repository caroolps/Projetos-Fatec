package lp1;

public class Musico {

	private String instrumento;
	private String aulas;
	private String afinacao;
	
	
	public Musico(String instrumento, String aulas, String afinacao) {
		this.instrumento=instrumento;
		this.aulas=aulas;
		this.afinacao=afinacao;
	}
	
	public String getInstrumento() {
		return instrumento;
	
}

	public String getAulas () {
		return aulas;
	}
	
	public String getAfinacao() {
		return afinacao;
	}
	
	public void setInstrumento(String instrumento) {
		this.instrumento=instrumento;
	}
	
	public void setAulas(String aulas) {
		this.aulas=aulas;
	}
	
	public void setAfinacao( String afinacao) {
		this.afinacao=afinacao;
	}
	
}