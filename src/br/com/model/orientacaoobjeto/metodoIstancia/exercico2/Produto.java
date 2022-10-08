package br.com.model.orientacaoobjeto.metodoIstancia.exercico2;

public class Produto {

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;
    Integer quantidadeEstoque;



    /* Método que verifica quantidade de reposição do estoque */
    Boolean eNecessarioReporEstoque() {
        if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return false;
    }

}
