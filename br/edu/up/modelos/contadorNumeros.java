package br.edu.up.modelos;

public class contadorNumeros {
    private double[] numContador;

    public contadorNumeros(double[] num) {
        this.numContador = num;
    }

    public int contadorNumerosNoIntervalo() {
        int count = 0;
        for (double num : numContador) {
            if (num >= 10 && num <= 150) {
                count++;
            }
        }
        return count++;
    }
}
