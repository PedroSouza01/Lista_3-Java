package br.edu.up.modelos;

public class Estudante {
    private String nome;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;
    
    private static final double PESO_LABORATORIO = 2;
    private static final double PESO_AVALIACAO_SEMESTRAL = 3;
    private static final double PESO_EXAME_FINAL = 5;
    
    public Estudante(String nome, int numeroMatricula, double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }
    
    public double calcularNotaFinal() {
        return (notaLaboratorio * PESO_LABORATORIO + 
                notaAvaliacaoSemestral * PESO_AVALIACAO_SEMESTRAL + 
                notaExameFinal * PESO_EXAME_FINAL) 
                / (PESO_LABORATORIO + PESO_AVALIACAO_SEMESTRAL + PESO_EXAME_FINAL);
    }
    
    public String calcularClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8.0) {
            return "A";
        } else if (notaFinal >= 7.0) {
            return "B";
        } else if (notaFinal >= 6.0) {
            return "C";
        } else if (notaFinal >= 5.0) {
            return "D";
        } else {
            return "R";
        }
    }
    
    public void imprimirResultado() {
        double notaFinal = calcularNotaFinal();
        String classificacao = calcularClassificacao();
        System.out.println("Nome: " + nome);
        System.out.println("Número de Matrícula: " + numeroMatricula);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }
}   
