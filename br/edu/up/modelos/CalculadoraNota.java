package br.edu.up.modelos;

public class CalculadoraNota {
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;
    
    private static final double PESO_LABORATORIO = 2;
    private static final double PESO_AVALIACAO_SEMESTRAL = 3;
    private static final double PESO_EXAME_FINAL = 5;
    
    public CalculadoraNota(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }
    
    public double calcularNotaFinal() {
        double notaFinal = (notaLaboratorio * PESO_LABORATORIO + 
                            notaAvaliacaoSemestral * PESO_AVALIACAO_SEMESTRAL + 
                            notaExameFinal * PESO_EXAME_FINAL) 
                            / (PESO_LABORATORIO + PESO_AVALIACAO_SEMESTRAL + PESO_EXAME_FINAL);
        return notaFinal;
    }
}
