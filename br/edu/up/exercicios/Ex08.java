package br.edu.up.exercicios;

import java.util.Scanner;

import modelos.Semestre;

public class Ex08 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scan.next();

        System.out.println("Digite a primeira nota do aluno ");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a segunda nota do aluno ");
        float nota2 = scan.nextFloat();

        System.out.println("Digite a terceira nota do aluno ");
        float nota3 = scan.nextFloat();

        Semestre semestre = new Semestre(nome, nota1, nota2, nota3);

        System.out.println("Notas referente ao aluno: " + semestre.getNomeAluno());
        System.out.println("A media de " + semestre.getNomeAluno() + " é " + semestre.getMedia());

        if (semestre.getMedia() >= 7) {
            System.out.println("O aluno foi Aprovado!");
        } else if (semestre.getMedia() <= 5) {
            System.out.println("O aluno foi Reprovado!");
        } else if (semestre.getMedia() >= 5.1 && semestre.getMedia() <= 6.9) {
            System.out.println("O aluno ficou Recupareção!");
        }

        scan.close();
    }
}
