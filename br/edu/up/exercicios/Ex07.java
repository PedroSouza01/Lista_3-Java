package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Veiculo;

public class Ex07 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do veiculo: ");
        float custoFabrica = scan.nextFloat();

        Veiculo veiculo = new Veiculo(custoFabrica);

        System.out.println("O custo total do veiculo é de: " + veiculo.getCustoTotal() + " Reais");

        scan.close();
    }
}
