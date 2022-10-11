package br.com.fiap.checkpoint2.dto;

import org.springframework.stereotype.Component;

import br.com.fiap.checkpoint2.model.Pedido;

@Component
public class PedidoMapper {
	
	public Pedido toPedido(PedidoCreationDto dto) {
		
		return new Pedido(dto.getDataPedido(), dto.getCodigoCliente(), dto.getDataPedido(), dto.getValorTotal());
	}

}
