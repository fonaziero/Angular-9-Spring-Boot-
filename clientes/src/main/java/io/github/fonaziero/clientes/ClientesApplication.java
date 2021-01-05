package io.github.fonaziero.clientes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.fonaziero.clientes.model.repository.ClienteRepository;
import io.github.fonaziero.clientes.model.entity.Cliente;


@SpringBootApplication
public class ClientesApplication {
	
	@Bean
	public CommandLineRunner run( @Autowired ClienteRepository repository) {
		
		return args -> {
			
			Cliente cliente = Cliente.builder().cpf("22222222222").nome("victor").build();
			repository.save(cliente);

		};

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}
}