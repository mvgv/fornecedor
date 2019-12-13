package com.microservicos.fornecedor.fornecedor.dto;

import com.microservicos.fornecedor.fornecedor.model.Endereco;
import com.microservicos.fornecedor.fornecedor.model.InfoFornecedor;

public class InfoFornecedorDto {
	
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static InfoFornecedorDto from(InfoFornecedor infoPorEstado) {
		// TODO Auto-generated method stub
		InfoFornecedorDto novoDto = new InfoFornecedorDto();
		Endereco end = new Endereco();
		end.setEndereco(infoPorEstado.getEndereco());
		end.setEstado(infoPorEstado.getEstado());
		end.setNome(infoPorEstado.getNome());
		novoDto.setEndereco(end);
		
		return novoDto;
	}

}
