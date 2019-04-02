package com.example100.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example100.repository.ProdutoRepository;
import com.example100.models.Produto;

import java.util.List;

@RestController

@RequestMapping(value="/api")
public class ProdutoResource {

	@Autowired
	ProdutoRepository pr;
	
	@GetMapping("/produto")
	public List<Produto> listaProduto(){
		return pr.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return pr.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvaProduto(@RequestBody Produto produto){
		return pr.save(produto);
	}
	
}
