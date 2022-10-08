package br.com.model.orientacaoobjeto.metodoIstancia.exercico2;

public class Exercicio02 {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Coca";
        produto.quantidadeEstoque = 8;

        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
    }

}
