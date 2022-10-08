package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_bonus_funcionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a meta de faturamento para esse ano");
        Double meta = scanner.nextDouble();

        System.out.print("Digite o faturamento ");
        Double faturamento = scanner.nextDouble();

        System.out.print("Digite a média salarial dos últimos 12 meses: ");
        Double mediaSalarial = scanner.nextDouble();


        /* calculo da meta dos 80%*/
        Double oitentaPorCentoDaMeta = (meta * 80) / 100;


        /* Verifica se bateu meta geral */
        Boolean bateuMeta = faturamento >= meta;

        /* Verifica se bateu 80% da meta geral */
        Boolean faturouPeloMenosOitentaPorCento = faturamento > oitentaPorCentoDaMeta;


        if (bateuMeta) {
            System.out.println("Você vai ganhar um bônus de 100%! Ele será de: " + mediaSalarial);

        } else if (faturouPeloMenosOitentaPorCento) {
            Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100;
            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);

        } else {
            System.out.println("Infelizmente, esse ano não tem bônus!");
        }
        scanner.close();
    }
}