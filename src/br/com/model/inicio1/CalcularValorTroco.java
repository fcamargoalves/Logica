package br.com.model.inicio1;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite Quantidade Passada pelo cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        /* Resultado */
        Double resultado = valorPassadoPeloCliente - valorProduto;
        System.out.println("Troco: " + resultado);

        scanner.close();
    }
}
