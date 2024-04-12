package br.edu.up.modelos;

public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;

    // Get e Set do nome
    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    // Get e Set Da nota da primeira prova
    public float getnota1() {
        return nota1;
    }

    public void setnota1(float nota1) {
        this.nota1 = nota1;
    }

    // Get e Set da nota da Segunda prova
    public float getnota2() {
        return nota2;
    }

    public void setnota2(float nota2) {
        this.nota2 = nota2;
    }

    // Get e Set da nota da Terceira prova
    public float getnota3() {
        return nota3;
    }

    public void setnota3(float nota3) {
        this.nota3 = nota3;
    }

    // Get da media

    public float getmedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}