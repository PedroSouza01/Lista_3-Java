package br.edu.up.exercicios;

import java.util.Scanner;

import br.edu.up.modelos.Funcionario18;

public class Ex18 {
    public static void executar(){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        Funcionario18 funcionario = new Funcionario18(nome, idade, sexo, salarioFixo);

        System.out.println("\nDetalhes do funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Líquido: R$" + funcionario.calcularSalarioLiquido());

        scanner.close();
    }
}
