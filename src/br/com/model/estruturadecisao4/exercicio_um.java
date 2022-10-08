package br.com.model.estruturadecisao4;

public class exercicio_um {
    public static void main(String[] args) {

        Double emprestimo = 4000.0;
        Double movimentacao = 2000.0;

        Boolean movimentaMetadeValor = (movimentacao * 2) >= emprestimo;
        Boolean tempoSuficenteAbertura = true;
        Boolean temNomeLimpo =true;

        Boolean liberarEmprestimo = movimentaMetadeValor && tempoSuficenteAbertura && temNomeLimpo;

        if (liberarEmprestimo){
            System.out.print("Pode Liberar emprestuimo.");
        }else{
            System.out.print("Não Pode Liberar emprestuimo.");
        }

    }
}
