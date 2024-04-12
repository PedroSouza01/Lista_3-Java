package br.edu.up.exercicios;

import modelos.Carro;

import java.util.Scanner;

public class Ex02 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida pelo carro (em Km): ");
        double distancia = scan.nextDouble();

        System.out.println("Digite o gasto do combustivel durante a viagem (em Litros): ");
        double gasto = scan.nextDouble();

        Carro carro = new Carro(distancia, gasto);

        System.out.println("O consumo média do carro é de " + carro.consumo());

        scan.close();
    }
}
