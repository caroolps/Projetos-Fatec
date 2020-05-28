package lp1;

public class musicoApp {

	public static void main(String [] args) {
		
		Musico musico1 = new Musico ("Violão,", "Aulas duas vezes por semana", "Violão afinado");
	
        System.out.println("Dados do musico1: "+musico1.getInstrumento() + " " + musico1.getAulas() + " " +musico1.getAfinacao ());

	}
}
