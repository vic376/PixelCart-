package com.nicoladelli.PixelCart.infrastructure.repository;

import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);



}
