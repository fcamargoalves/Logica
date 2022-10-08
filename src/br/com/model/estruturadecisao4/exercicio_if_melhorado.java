package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_if_melhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o pesso");
        Double peso = scanner.nextDouble();

        Boolean pesoLeve   = peso <= 60 && (peso > 0);
        Boolean pesoMedio  = (peso > 60) &&  (peso <= 90);
        Boolean pesoPesado = peso > 90;

        if (pesoLeve){
            System.out.print("Peso Leve");
        }else  if(pesoMedio){
            System.out.print("Peso Médio");
        }else if (pesoPesado){
            System.out.print("Peso Pesado");
        }else{
            System.out.print("Não encontrado nehum peso para o lutador");
        }

        scanner.close();
    }
}
