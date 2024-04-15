package br.edu.up.modelos;

public class Semestre {
    private String nomeAluno;
    private float nota1Aluno;
    private float nota2Aluno;
    private float nota3Aluno;
    private float media;

    public Semestre(String nome, float nota1, float nota2, float nota3) {
        this.nomeAluno = nome;
        this.nota1Aluno = nota1;
        this.nota2Aluno = nota2;
        this.nota3Aluno = nota3;
        this.calcular();
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    //
    public float getMedia() {
        return this.media;
    }

    public void calcular() {
        this.media = (this.nota1Aluno + this.nota2Aluno + this.nota3Aluno) / 3;
    }
    //

    public float getNota1Aluno() {
        return this.nota1Aluno;
    }

    public float getNota2Aluno() {
        return this.nota2Aluno;
    }

    public float getNota3Aluno() {
        return this.nota3Aluno;
    }
}
