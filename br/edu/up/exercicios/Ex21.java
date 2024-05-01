package br.edu.up.exercicios;

public class Ex21 {
    public static void executar(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        Nadador nadador = new Nadador(idade);

        if(idade >= 5 && idade <= 7){
            System.out.println("Nadador da categoria - Infantil A");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Nadador da categoria - Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Nadador da categoria - juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("Nadador da categoria - juvenil B");
        }else if(idade >= 18 && idade <= 25){
            System.out.println("Nadador da categoria - juvenil B");
        }else{
            System.out.println("Idade fora da faixa etária");
        }

        scan.close();
    }
}