package br.edu.up.exercicios;

import java.util.Scanner;
import modelos.Pessoa;

public class Ex11 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        String sexo[] = new String[56];
        String nome[] = new String[56];

        Pessoa pessoa = new Pessoa(sexo, nome);

        int mulher = 0;
        int homen = 0;

        for (int i = 0; i < 56; i++) {
            int num = i + 1;

            System.out.println("Digite o nome da " + num + "° pessoa: ");
            nome[i] = scan.next();

            System.out.println("Digite o sexo da " + num + "° pessoa (Masculino ou Feminino): ");
            sexo[i] = scan.next();

            if (sexo[i].equals("Masculino")) {
                System.out.println("A pessoa é Homem!\n");
                homen++;
            } else if (sexo[i].equals("Feminino")) {
                System.out.println("A pessoa é Mulher!\n");
                mulher++;
            } else {
                System.out.println("Sexo Inválido");
            }

            System.out.println("O total de Homens foi de: " + homen);

            System.out.println("O total de Mulheres foi de: " + mulher + "\n");

        }

        scan.close();
    }
}