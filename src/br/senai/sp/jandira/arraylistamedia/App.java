package br.senai.sp.jandira.arraylistamedia;

public class App {

	public static void main(String[] args) {
		
		Media objMedia = new Media();
		
		objMedia.receberNotas();
		objMedia.exibirNota();
		System.out.println("M�dia final: " + objMedia.calcularMedia());
		
	}

}
