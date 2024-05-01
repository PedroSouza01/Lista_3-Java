package br.edu.up.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Funcionario;

public class Ex16 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Digite o número de funcionários: ");
        int numeroFuncionarios = scanner.nextInt();

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("\nFuncionário " + (i + 1));
            System.out.println("Digite o nome do funcionário: ");
            String nome = scanner.next();
            System.out.println("Digite o salário do funcionário (em reais): ");
            double salario = scanner.nextDouble();
            funcionarios.add(new Funcionario(nome, salario));
        }

        System.out.println("\nAplicando reajustes...");
        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarReajuste();
        }

        System.out.println("\nDetalhes dos funcionários após reajuste:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
