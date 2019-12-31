package com.microservicos.fornecedor.fornecedor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservicos.fornecedor.fornecedor.dto.InfoFornecedorDto;
import com.microservicos.fornecedor.fornecedor.service.InfoService;

@RestController
public class InfoController {
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);
	
	@Autowired
	InfoService infoService;
	
	@GetMapping(path="/info/{estado}")
	public InfoFornecedorDto getEstado(@PathVariable("estado") String estado) {
		LOG.info("Recuperando informacoes do fornecedor");
		return InfoFornecedorDto.from(infoService.getInfoPorEstado(estado));
	}
}
