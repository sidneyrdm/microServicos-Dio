package com.dio.microsservicosDio.repository;

import com.dio.microsservicosDio.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
