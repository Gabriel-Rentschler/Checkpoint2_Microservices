package br.com.fiap.checkpoint2.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.PedidoCreationDto;
import br.com.fiap.checkpoint2.dto.PedidoGetDto;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;

@Service
public class PedidoGetCommand {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public PedidoGetDto get() {
		return new PedidoGetDto(pedidoRepository.findAll());
	}
	
	public PedidoCreationDto getById(Long id) {
		
		PedidoCreationDto pedido = new PedidoCreationDto(pedidoRepository.findById(id).orElse(null));
		
		return pedido;
	}
}
