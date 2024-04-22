package br.edu.up.modelos;

public class ServicoMilitar {
    private String nomeS;
    private String sexoS;
    private String saudeS;
    private int idadeS;

    public ServicoMilitar(String nome, String sexo, String saude, int idade) {
        this.nomeS = nome;
        this.sexoS = sexo;
        this.saudeS = saude;
        this.idadeS = idade;
    }

    public String getNomeS() {
        return nomeS;
    }

    public void setNomeS(String nome) {
        this.nomeS = nome;
    }

    public String getSexoS() {
        return sexoS;
    }

    public void setSexoS(String sexo) {
        this.sexoS = sexo;
    }

    public String getSaudeS() {
        return saudeS;
    }

    public void setSaudeS(String saude) {
        this.saudeS = saude;
    }

    public int getIdadeS() {
        return idadeS;
    }

    public void setIdadeS(int idade) {
        this.idadeS = idade;
    }
}
