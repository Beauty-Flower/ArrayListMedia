package br.senai.sp.jandira.arraylistamedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	Scanner sc;
	ArrayList<Double> arrNotas = new ArrayList<Double>();
	
	double soma;
	double media;
	int contNota;
	
	public Media() {
		
		sc = new Scanner(System.in);
		
		/*arrNotas.add(10.0);
		arrNotas.add(5.5);
		arrNotas.add(8.0);
		arrNotas.add(2.5);*/
	}
	
	public void receberNotas() {
		
	System.out.println("Digite uma nota ou -1 para encerrar ");
		
	double nota = sc.nextDouble();
		
		while(nota >= 0) {
			arrNotas.add(nota);
			System.out.println("Digite uma nota ou -1 para encerrar ");
			nota = sc.nextDouble();
			contNota++;
		}
	}
	
	public void exibirNota() {
		
		for (int i = 0; i < arrNotas.size(); i++) {
			System.out.println("Nota " + (i + 1) + ": " + arrNotas.get(i));
		}
	}
	
	public double calcularMedia() {

		arrNotas.forEach(nota->{
			soma += nota;
		});
		
		media = soma / contNota;
		return media;
	}
}
