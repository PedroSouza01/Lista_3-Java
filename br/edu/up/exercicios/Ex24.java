package br.edu.up.exercicios;

public class Ex24 {
    public static void executar(){
        CalculadoraNota calculadora = new CalculadoraNota(8.5, 7.0, 9.0);
        double notaFinal = calculadora.calcularNotaFinal();
        System.out.println("A nota final do estudante é: " + notaFinal);
    }
}
