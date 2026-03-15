package com.nicoladelli.PixelCart.domain.service;

import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.infrastructure.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto criarProduto (Produto produto){
        return repository.save(produto);
    }

    public void deletarProduto (Long id){
        repository.deleteById(id);
    }

    public List<Produto> listarProduto(){
        return repository.findAll();
    }

    public List<Produto> buscarProdutoNome (String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }
}
