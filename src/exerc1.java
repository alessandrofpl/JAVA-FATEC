import java.util.Scanner;
import java.util.Random;
public class exerc1 {
	public static void main(String[] args) {
		
		 /*System.out.println("Digite a Idade:");
		  int idade = ler.nextInt(); if(idade >= 60) { System.out.println("Idosa");
		  }else if( idade >= 18) { System.out.println("Adulto"); }else {
		  System.out.println("Criança"); }
		 */
		 
			/*
			 * int soma = 0, atual=1;
			 * 
			 * System.out.println("Digite um número"); int n = ler.nextInt();
			 * 
			 * for(int c=0;c<n;c++) { soma+=atual; //1|4|9|16 atual +=2; //3|5|7|9 }
			 * System.out.println("A soma dos impares é:" + soma);
			 */
//		 String[] nomes = new String[5];
//		 String outronome;
//		for(int c=0; c<=4; c++) {
//			System.out.println("Digite um nome");
//			nomes[c]= ler.nextLine();
//		}
//		System.out.println("Digite outro nome para verificar");
//		outronome = ler.nextLine();
//		
//		for(int c=0; c<=4; c++) {
//			if(outronome.equals(nomes[c])) {
//				System.out.println("Nome Igual encontrado");
//			}
//		}
		 Scanner ler = new Scanner(System.in); 
		 Random rand = new Random();

		 int[] aleatorios = new int[10];
		 for(int c=0; c<=9; c++) {
			 aleatorios[c] = rand.nextInt(100);
		 }
		 for(int c=0; c<=9; c++) {
			 if(aleatorios[c]%2==0) {
				 System.out.println(aleatorios[c]);
			 }
		 }
		  
		 
		 
		
		
	}
}
