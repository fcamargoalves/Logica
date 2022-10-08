package br.com.model.variaveis2;

import java.util.Scanner;

public class UsandoConstante {

    static final Integer IDADE_MINIMA_CARTEIRA = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //final Integer idadeCarteira = 18;

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= IDADE_MINIMA_CARTEIRA;

        if (podeTirarCarteira){
            System.out.print(" Sim ");
        }else{
            System.out.print(" Não ");
        }
        scanner.close();
    }
}
