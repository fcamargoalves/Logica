package br.com.model.variaveis2;

import java.util.Scanner;

public class AlteraValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Informe o tipo pagamento [1 - A Vista 2 - A Prazo]: ");
        Integer tipo = scanner.nextInt();

        Boolean pagamentoAvista = tipo.equals(1);


        Double juros = 0.0;
        if (!pagamentoAvista) {
            juros = 10.0;
        }
        Double acrescimo = valorProduto * juros / 100;
        Double valorTotal = acrescimo + valorProduto;
        System.out.print("Valor do produto: " + valorTotal);

        scanner.close();
    }
}