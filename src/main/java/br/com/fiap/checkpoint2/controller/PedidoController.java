package br.com.fiap.checkpoint2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.command.PedidoAddCommand;
import br.com.fiap.checkpoint2.command.PedidoDeleteCommand;
import br.com.fiap.checkpoint2.command.PedidoGetCommand;
import br.com.fiap.checkpoint2.command.PedidoUpdateCommand;
import br.com.fiap.checkpoint2.dto.PedidoCreationDto;
import br.com.fiap.checkpoint2.dto.PedidoGetDto;
import br.com.fiap.checkpoint2.dto.PedidoIdDto;
import br.com.fiap.checkpoint2.dto.PedidoMapper;
import br.com.fiap.checkpoint2.model.Pedido;

@RestController
@RequestMapping("api/pedidos")
public class PedidoController {

	@Autowired
	private PedidoGetCommand pedidoGet;
	
	@Autowired
	private PedidoUpdateCommand pedidoSet;

	@Autowired
	private PedidoAddCommand pedidoAdd;

	@Autowired
	private PedidoDeleteCommand pedidoDelete;
	
	@Autowired
	private PedidoMapper pedidoMapper;
	
	@DeleteMapping ("/{id}")
	public PedidoIdDto deletePedido(@PathVariable Long id) {
		pedidoDelete.delete(id);
		
		return new PedidoIdDto(id);
	}
	
	@PutMapping ("/{id}")
	public PedidoIdDto updatePedido(@PathVariable Long id ,@RequestBody PedidoCreationDto pedidoDto) {
		
		Pedido pedido = pedidoMapper.toPedido(pedidoDto);
		
		pedido.setId(id);
		
		Pedido editPedido = pedidoSet.edit(pedido);
		
		return new PedidoIdDto(editPedido.getId());
	}
	
	@PostMapping
	public PedidoIdDto createPedido(@RequestBody PedidoCreationDto pedidoDto) {
		
		Pedido pedido = pedidoMapper.toPedido(pedidoDto);
		
		Pedido newPedido = pedidoAdd.add(pedido);
		
		return new PedidoIdDto(newPedido.getId());
	}
	
	
	@GetMapping
	public PedidoGetDto getPedido() {
		return pedidoGet.get();
		
	}	
	
	@GetMapping ("/{id}")
	public PedidoCreationDto getPedidoById(@PathVariable Long id) {
		return pedidoGet.getById(id);
		
	}	
}
