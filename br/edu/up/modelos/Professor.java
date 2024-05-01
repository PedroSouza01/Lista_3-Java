package br.edu.up.modelos;

public class Professor {
    private int horasObj;
    private int nivelObj;
    private float salarioObj;

    public Professor(int horas, int nivel, float salario) {
        this.horasObj = horas;
        this.nivelObj = nivel;
        this.salarioObj = salario;
    }

    public int getHoras() {
        return horasObj;
    }

    public void setHoras(int horas) {
        this.horasObj = horas;
    }

    public int getNivel() {
        return nivelObj;
    }

    public void setNivel(int nivel) {
        this.nivelObj = nivel;
    }

    public float getSalario() {
        return salarioObj;
    }

    public void setSalario(float salario) {
        this.salarioObj = salario;
    }

}
