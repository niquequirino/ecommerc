package com.senai.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.senai.ecommerce.dto.ProdutoDTO;
import com.senai.ecommerce.entities.Produto;
import com.senai.ecommerce.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repo;
	
	public List<ProdutoDTO> buscarTodos() {
		List<Produto> list = repo.findAll();
		return list.stream().map(x -> new ProdutoDTO(x)).toList();
		
	}
		public Page<ProdutoDTO> buscarPagina(Pageable pagina){
			Page<Produto> result = repo.findAll(pagina);
			return result.map(x -> new ProdutoDTO(x));
		}
		
		public ProdutoDTO adicionar (ProdutoDTO produtoDTO){
			Produto produto = new Produto();
			
			produto.setNome(produtoDTO.getNome());
			produto.setDescricao(produto.getDescricao());
			produto.setPreco(produto.getPreco());
			produto.setImgUrl(produto.getImgUrl());
			
			Produto saveProduto = repo.save(produto);
			
			return new ProdutoDTO(saveProduto);
			
		}
}
