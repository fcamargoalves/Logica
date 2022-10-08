package br.com.model.estruturadecisao4;

import java.util.Scanner;

public class exercicio_verifica_se_passou {

    static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
    static final Double NOTA_MINIMA = 60.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");

        System.out.print("Português: ");
        Double notaDePortugues = scanner.nextDouble();

        System.out.print("Matemática: ");
        Double notaDeMatematica = scanner.nextDouble();

        /* Verifica se a nota minima para cada matéria */
        Boolean estaAcimaDaNoataDePortugues  = notaDePortugues >= NOTA_MINIMA;
        Boolean estaAcimaDaNoataDeMatematica = notaDeMatematica >= NOTA_MINIMA;


        /* Verifica se a nota geral */
        Double  notaTotal = notaDeMatematica + notaDeMatematica;
        Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;

        /* verifica condição */
        Boolean passou = temNotaParaPassar && estaAcimaDaNoataDePortugues && estaAcimaDaNoataDeMatematica;


        if (passou) {
            System.out.println("Parabéns! Você passou.");
        } else {
            System.out.println("Infelizmente, não foi dessa vez.");
        }

        scanner.close();
    }
}