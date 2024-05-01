package br.edu.up.exercicios;

import java.util.Scanner;

public class Ex22 {
     public static void executar(){
        Scanner scan = new Scanner(System.in);

        double valor = 0;

        System.out.println("Digite 1 para residência, 2 para comércio ou 3 para indústria: ");
        int TipoCliente = scan.nextInt();

        System.out.println("Digite quantas horas foi gasto: ");
        float  kilowatt = scan.nextFloat();

        ContaLuz contaLuz = new ContaLuz(TipoCliente, kilowatt, valor);

        switch (TipoCliente) {
            case 1:
            valor = kilowatt * 0.60;
            System.out.println("A conta de luz é da residência é de: " + valor + " Reais");
                break;

            case 2:
            valor = kilowatt * 0.48;
            System.out.println("A conta de luz do comércio é de: " + valor + " Reais");
                break;

            case 3:
            valor = kilowatt * 1.29;
            System.out.println("A conta de luz da indústria é de: " + valor + " Reais");
                break;
        
            default:
            System.out.println("!ERRO!");
                break;
        }

        scan.close();
    }
}
