package br.com.model.operadores3;

import java.util.Scanner;

public class Exercicio_DescontoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto.");
        Double valorProduto = scanner.nextDouble();

        Double valorFrete = 15.0;
        Double valorFinal = valorProduto + valorFrete ;

        if(valorProduto < 100){
            System.out.print("Valor do Produto com   Frete:  " + valorFinal);
        }else{
            System.out.print("Valor do Produto: " + valorProduto);
        }
    }

}
