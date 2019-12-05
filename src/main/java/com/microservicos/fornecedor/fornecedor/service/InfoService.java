package com.microservicos.fornecedor.fornecedor.service;

import org.springframework.stereotype.Service;

import com.microservicos.fornecedor.fornecedor.model.InfoFornecedor;

@Service
public interface InfoService {

	public InfoFornecedor getInfoPorEstado(String estado);

	
}
