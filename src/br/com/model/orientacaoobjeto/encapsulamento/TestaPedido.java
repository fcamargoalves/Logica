package br.com.model.orientacaoobjeto.encapsulamento;

public class TestaPedido {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.codigo = 1;
        pedido.subtotal = 100.0;
		pedido.desconto = 5.0;

        System.out.println("Código: " + pedido.getCodigo() +
                ", Subtotal: " + pedido.getSubtotal() +
                ", Desconto: " + pedido.getDesconto() + ", " +
                "Total: " + pedido.getTotal());
    }
}
