package br.com.fiap.checkpoint2.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;

import br.com.fiap.checkpoint2.model.Pedido;

public class PedidoCreationDto {

	private Instant dataPedido;
	private Long codigoCliente;
	private Instant dataCadastro;
	private BigDecimal valorTotal;
	
	public PedidoCreationDto(Pedido pedido) {
		this.dataPedido = pedido.getDataPedido();
		this.dataCadastro = pedido.getDataCadastro();
		this.codigoCliente = pedido.getCodigoCliente();
		this.valorTotal = pedido.getValorTotal();
	}
	
	public Instant getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Instant dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public Instant getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Instant dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
