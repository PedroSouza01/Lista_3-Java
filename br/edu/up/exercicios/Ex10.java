package exercicios;

import java.util.Scanner;

import modelos.ContadorIdade;

public class Ex10 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas desejadas para mostrar a idade: ");
        int quantidadePessoas = scan.nextInt();

        int num = 1;
        int idade;

        for (int i = 0; i < quantidadePessoas; i++) {

            System.out.println("Digite a idade da " + num + "° pessoa\n ");
            idade = scan.nextInt();

            System.out.println("A idade da " + num + "° pessoa é: " + idade + "\n");
            num++;
        }

        scan.close();
    }
}