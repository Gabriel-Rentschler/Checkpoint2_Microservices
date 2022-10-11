package br.com.fiap.checkpoint2.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;

@Service
public class PedidoUpdateCommand {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido edit(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
}
