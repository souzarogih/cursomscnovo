package com.nelioalves.cursomscnovo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.nelioalves.cursomscnovo.domain.Estado;
import com.nelioalves.cursomscnovo.services.validation.ClienteUpdate;

@ClienteUpdate
public class EstadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Prenchimento obrigatório")
	@Length(min=5, max=120, message = "O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;
		
	public EstadoDTO() {
		
	}

	public EstadoDTO(Estado obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
