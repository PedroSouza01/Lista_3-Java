package br.edu.up.modelos;

public class Pessoa {
    private String[] sexoObj;
    private String[] nomeObj;

    public Pessoa(String[] sexo, String[] nome) {
        this.sexoObj = sexo;
        this.nomeObj = nome;
    }

    public String[] getSexoObj() {
        return this.sexoObj;
    }

    public void setSexoObj(String[] sexo) {
        this.sexoObj = sexo;
    }

    public String[] getNomeObj() {
        return this.nomeObj;
    }

    public void setNomeObj(String[] nome) {
        this.nomeObj = nome;
    }

}
