package numeroDeAlunos;

import java.util.Scanner;

public class NumeroDeAlunos {

// Escreva um programa Java que leia o número de alunos e o de alunas de uma sala. Como saída, o programa deve apresentar primeiro quem estiver em maior quantidade.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de alunos.");
		int qAlunos = entrada.nextInt();

		System.out.println("Quantidade de alunas.");
		int qAlunas = entrada.nextInt();

		if (qAlunos > qAlunas) {

			System.out.println("Alunos: " + qAlunos + "\nAlunas: " + qAlunas);

		} else if (qAlunas > qAlunos) {
			System.out.println("Alunas: " + qAlunas + "\nAlunos: " + qAlunos);

		} else {
			System.out.println("Alunos = Alunas");
		}

		entrada.close();
	}

}
