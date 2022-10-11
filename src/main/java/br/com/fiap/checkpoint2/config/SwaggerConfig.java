package br.com.fiap.checkpoint2.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info (
		title = "Aplicação DTO de Pedido",
		version="1.0",
		description="Projeto DTO de Pedido"))
public class SwaggerConfig {
	
	

}
