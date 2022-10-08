package br.com.model.iteracao5.para;

public class exercico_for_2 {
    public static void main(String[] args) {

        Double[] carrinhoDeCompras = new Double[]{50.0, 50.0, 50.0};
        Double total = 0.0;

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.println("Iteração: " + i + ", Total: " + total);
            total += carrinhoDeCompras[i];
        }
        System.out.println("Total do carrinho: " + total);
    }
}
