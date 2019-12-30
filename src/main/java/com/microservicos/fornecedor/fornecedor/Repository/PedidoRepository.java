package com.microservicos.fornecedor.fornecedor.Repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicos.fornecedor.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
