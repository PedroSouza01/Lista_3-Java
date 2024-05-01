package br.edu.up.exercicios;

import java.util.Scanner;

public class Ex23 {
    public static void executar(){
        
        Scanner scan = new Scanner(System.in);
        double peso = 0;

        System.out.println("Digite o nome da pessoa: ");
        String nome = scan.next();

        System.out.println("Digite o genero da pessoa: ");
        String genero = scan.next();

        System.out.println("Digite a altura da pessoa: ");
        double altura = scan.nextDouble();

        System.out.println("Digite a idade da pessoa: ");
        int idade = scan.nextInt();

        PeseoIdeal pesoIdeal = new PeseoIdeal(nome, genero, altura, idade);

        if(genero.equals("M") && altura > 1.70 && idade <= 20){
            peso = (72.7 * altura) - 58;
            System.out.println("O peso ideal do " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("M") && altura > 1.70 && idade >= 21 && idade <=39) {
            peso = (72.7 * altura) - 53;
            System.out.println("O peso ideal do " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("M") && altura > 1.70 && idade >= 40) {
        peso = (72.7 * altura) - 45;
            System.out.println("O peso ideal do " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("M") && altura <= 1.70 && idade <= 40) {
            peso = (72.7 * altura) - 50;
            System.out.println("O peso ideal do " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("M") && altura <= 1.70 && idade > 40) {
            peso = (72.7 * altura) - 58;
            System.out.println("O peso ideal do " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("F") && altura > 1.50) {
            peso = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal da " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("F") && altura <= 1.50 && idade >= 35 )  {
            peso = (62.1 * altura) - 45;
            System.out.println("O peso ideal da " + nome + " é de: " + peso + "Kg");
        }
        else if (genero.equals("F") && altura <= 1.50 && idade < 35 )  {
            peso = (62.1 * altura) - 49;
            System.out.println("O peso ideal da " + nome + " é de: " + peso + "Kg");
        }

        scan.close();
    }
}
