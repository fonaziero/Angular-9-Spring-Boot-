package io.github.fonaziero.clientes.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	private String nome;

	@Column(nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	@PrePersist
	public LocalDate prePersist() {
		setDataCadastro(LocalDate.now());
	}


}