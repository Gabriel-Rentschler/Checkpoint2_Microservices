package br.com.fiap.checkpoint2.dto;

import java.util.List;

import br.com.fiap.checkpoint2.model.Pedido;

public class PedidoGetDto {
	
	private List<Pedido> listaPedidos;
	
	public PedidoGetDto(List<Pedido> pedidos) {
		this.listaPedidos = pedidos;
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
}
