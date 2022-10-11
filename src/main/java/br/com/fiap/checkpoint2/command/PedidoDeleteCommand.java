package br.com.fiap.checkpoint2.command;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.checkpoint2.repository.PedidoRepository;

public class PedidoDeleteCommand {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public void delete(Long id) {
			pedidoRepository.deleteById(id);
	}
}
