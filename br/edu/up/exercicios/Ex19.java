package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelos.Triangulo;

public class Ex19 {
    public static void executar(){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o comprimento do lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o comprimento do lado 3: ");
        int lado3 = scanner.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.verificarTriangulo()) {
            System.out.println("Os valores informados podem ser os lados de um triângulo.");
            System.out.println("Tipo de triângulo: " + triangulo.classificarTriangulo());
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }
}   
