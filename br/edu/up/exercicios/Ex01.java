package br.edu.up.exercicios;

import br.edu.up.modelos.Aluno;

public class Ex01 {
    public static void executar() {
        Aluno aluno = new Aluno();

        aluno.setnome("Pedro");
        aluno.setnota1(7);
        aluno.setnota2(5);
        aluno.setnota3(8);

        System.out.println("Nome: " + aluno.getnome());

        System.out.println("A nota da Primeira prova do aluno " + aluno.getnome() + " foi: " + aluno.getnota1());
        System.out.println("A nota da Segunda prova do aluno " + aluno.getnome() + " foi: " + aluno.getnota2());
        System.out.println("A nota da Terceira prova do aluno " + aluno.getnome() + " foi: " + aluno.getnota3());

        System.out.println("A média é: " + aluno.getmedia());

    }
}
