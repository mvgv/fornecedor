package com.microservicos.fornecedor.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservicos.fornecedor.fornecedor.Repository.InfoRepository;
import com.microservicos.fornecedor.fornecedor.model.InfoFornecedor;

public class InfoServiceImpl implements InfoService {

	@Autowired
	InfoRepository repository;
	
	@Override
	public InfoFornecedor getInfoPorEstado(String estado) {
		// TODO Auto-generated method stub
		return repository.findByEstado(estado);
	}

}
