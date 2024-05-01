package br.edu.up.modelos;

public class Seguradora {
    private String nome;
    private int idade;
    private String grupoRisco;
    
    public Seguradora(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }
    
    public void determinarCategoria() {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "baixo":
                    System.out.println("Categoria: 1");
                    break;
                case "médio":
                    System.out.println("Categoria: 2");
                    break;
                case "alto":
                    System.out.println("Categoria: 3");
                    break;
                default:
                    System.out.println("Grupo de risco inválido.");
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "baixo":
                    System.out.println("Categoria: 2");
                    break;
                case "médio":
                    System.out.println("Categoria: 3");
                    break;
                case "alto":
                    System.out.println("Categoria: 4");
                    break;
                default:
                    System.out.println("Grupo de risco inválido.");
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "baixo":
                    System.out.println("Categoria: 3");
                    break;
                case "médio":
                    System.out.println("Categoria: 4");
                    break;
                case "alto":
                    System.out.println("Categoria: 5");
                    break;
                default:
                    System.out.println("Grupo de risco inválido.");
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case "baixo":
                    System.out.println("Categoria: 4");
                    break;
                case "médio":
                    System.out.println("Categoria: 5");
                    break;
                case "alto":
                    System.out.println("Categoria: 6");
                    break;
                default:
                    System.out.println("Grupo de risco inválido.");
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case "baixo":
                    System.out.println("Categoria: 7");
                    break;
                case "médio":
                    System.out.println("Categoria: 8");
                    break;
                case "alto":
                    System.out.println("Categoria: 9");
                    break;
                default:
                    System.out.println("Grupo de risco inválido.");
            }
        } else {
            System.out.println("Idade fora da faixa necessária para adquirir o seguro.");
        }
    }
    
}
