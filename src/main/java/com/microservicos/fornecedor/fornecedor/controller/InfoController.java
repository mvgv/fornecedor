package com.microservicos.fornecedor.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservicos.fornecedor.fornecedor.model.InfoFornecedor;
import com.microservicos.fornecedor.fornecedor.service.InfoService;

@RestController
public class InfoController {
	
	
	@Autowired
	InfoService infoService;
	
	@GetMapping(path="/info/{estado}")
	public InfoFornecedor getEstado(@PathVariable("estado") String estado) {
		return infoService.getInfoPorEstado(estado);
	}
}
