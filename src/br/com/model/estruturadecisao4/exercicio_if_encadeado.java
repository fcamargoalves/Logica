package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_if_encadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("igite o pesso");
        Double peso = scanner.nextDouble();


        Boolean pesoLeve   = peso <= 60;
        if (pesoLeve){
            System.out.print("Peso Leve");
        }
        else{
            Boolean pesoMedio  = (peso > 60) &&  (peso <= 90);
            if (pesoMedio){
                System.out.print("Peso Médio");
            }
            else{
                Boolean pesoPesado = peso > 90;
                if (pesoPesado){
                    System.out.print("Peso Pesado");
                }
            }
        }
        scanner.close();
    }
}
