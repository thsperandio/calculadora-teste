package br.com.dio.calculadora;

import java.util.Scanner;


public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;	
		
		System.out.println("Digite o primiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtraçao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Divisao: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);
		
	}

		

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtraçao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	
}
