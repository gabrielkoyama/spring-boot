package com.example100.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example100.models.*;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findById(long id);
}
