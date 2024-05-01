package br.edu.up.modelos;

public class PeseoIdeal {
    private String nomeObj;
    private String generoObj;
    private double alturaObj;
    private int idadeObj;

    public PeseoIdeal(String nome, String genero, double altura, int idade) {
        this.nomeObj = nome;
        this.generoObj = genero;
        this.alturaObj = altura;
        this.idadeObj = idade;
    }

    public String getNomeObj() {
        return nomeObj;
    }

    public void setNomeObj(String nome) {
        this.nomeObj = nome;
    }

    public String getGeneroObj() {
        return generoObj;
    }

    public void setGeneroObj(String genero) {
        this.generoObj = genero;
    }

    public double getAlturaObj() {
        return alturaObj;
    }

    public void setAlturaObj(double altura) {
        this.alturaObj = altura;
    }

    public int getIdadeObj() {
        return idadeObj;
    }

    public void setIdadeObj(int idade) {
        this.idadeObj = idade;
    }

}
