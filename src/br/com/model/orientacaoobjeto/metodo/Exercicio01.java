package br.com.model.orientacaoobjeto.metodo;

public class Exercicio01 {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "coca cola";
        produto.precoUnitario = 200;
        produto.quantidadeEstoque = 8;
    }

    static Boolean eNecessarioReporEstoque(Produto produto) {
        if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        } else {
            return false;
        }
    }
}
