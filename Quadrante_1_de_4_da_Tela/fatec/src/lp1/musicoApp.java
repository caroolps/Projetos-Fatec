package lp1;

public class musicoApp {

	public static void main(String [] args) {
		
		Musico musico1 = new Musico ("Viol�o,", "Aulas duas vezes por semana", "Viol�o afinado");
	
        System.out.println("Dados do musico1: "+musico1.getInstrumento() + " " + musico1.getAulas() + " " +musico1.getAfinacao ());

	}
}
