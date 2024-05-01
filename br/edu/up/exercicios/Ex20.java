package br.edu.up.exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void executar(){
         Scanner scan = new Scanner(System.in);
        float salario = 0;

        System.out.println("Digite o total de horas trabalhadas pelo professor: ");
        int horas = scan.nextInt();

        System.out.println("Digite o nível do Professor(1, 2 ou 3): ");
        int nivel = scan.nextInt();;

        Professor professor = new Professor(horas, nivel, salario);

        switch (nivel) {
            case 1:
                salario = horas * 12;
                System.out.println("O professor tera um salário de: " + salario + " Reais");
                break;

            case 2:
                salario = horas * 17;
                System.out.println("O professor tera um salário de: " + salario + " Reais");
                break;

            case 3:
                salario = horas * 25;
                System.out.println("O professor tera um salário de: " + salario + " Reais");
                break;
        
            default:
                System.out.println("!Erro!");
                break;
        }

        scan.close();
    }
}
