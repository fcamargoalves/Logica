package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_if_normal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("igite o pesso");
        Double peso = scanner.nextDouble();

        Boolean pesoLeve   = peso <= 60;
        Boolean pesoMedio  = (peso > 60) &&  (peso <= 90);
        Boolean pesoPesado = peso > 90;

        if (pesoLeve){
            System.out.print("Peso Leve");
        }

        if (pesoMedio){
            System.out.print("Peso Médio");
        }

        if (pesoPesado){
            System.out.print("Peso Pesado");
        }

        scanner.close();
    }
}
