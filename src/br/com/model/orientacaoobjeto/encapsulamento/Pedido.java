package br.com.model.orientacaoobjeto.encapsulamento;

public class Pedido {

    Integer codigo;
	Double subtotal;
	Double desconto;


	Double getTotal() {
		return subtotal - desconto;
	}

	void setTotal(Double total) {
		// Não é mais necessário
	}


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
