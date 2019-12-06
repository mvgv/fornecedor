package com.microservicos.fornecedor.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicos.fornecedor.fornecedor.Repository.InfoRepository;
import com.microservicos.fornecedor.fornecedor.model.InfoFornecedor;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	InfoRepository repository;
	
	@Override
	public InfoFornecedor getInfoPorEstado(String estado) {
		// TODO Auto-generated method stub
		InfoFornecedor f = repository.findByEstado(estado);
		return f;
	}

}
