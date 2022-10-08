package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês: ");
        Integer mes = scanner.nextInt();

        Double desconto = 0.0;

        switch (mes){
            case 1: desconto = 0.0;
                break;

            case 2: desconto = 1.0;
                break;
            case 3: desconto = 15.0;
                break;
            case 4: desconto = 30.0;
                break;
            case 5: desconto = 31.0;
                break;
            case 6: desconto = 10.0;
                break;
            case 7: desconto = 11.0;
                break;
            case 8: desconto = 12.0;
                break;
            case 9: desconto = 5.0;
                break;
            case 10: desconto = 6.0;
                break;
            case 11: desconto = 01.0;
                break;
            case 12: desconto = 02.0;
                break;

            default:
                System.out.print("Digite um mês válido.");
        }
        System.out.print("Seu desconto será de: " + desconto);
        System.exit(1);

        scanner.close();
    }
}
