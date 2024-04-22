package br.edu.up.exercicios;

import modelos.contadorNumeros;

import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);
        double num[] = new double[80];

        System.out.println("Digite 80 numeros para saber se esta no intervalo entre 10 e 150: ");
        for (int i = 0; i < 80; i++) {
            num[i] = scan.nextDouble();
        }

        contadorNumeros contador = new contadorNumeros(num);

        System.out.println("Os numeros que estao entre 10 e 150 são: " + contador.contadorNumerosNoIntervalo());

        scan.close();
    }
}
