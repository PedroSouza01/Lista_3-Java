package br.edu.up.exercicios;

public class Ex26 {
    public static void executar(){
        Seguradora pretendente1 = new Seguradora("João", 25, "baixo");
        pretendente1.determinarCategoria();
        
        Seguradora pretendente2 = new Seguradora("Maria", 18, "alto");
        pretendente2.determinarCategoria();
        
        Seguradora pretendente3 = new Seguradora("Pedro", 71, "médio");
        pretendente3.determinarCategoria();
    }
}

