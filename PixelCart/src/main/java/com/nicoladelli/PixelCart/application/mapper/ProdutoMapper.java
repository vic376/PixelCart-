package com.nicoladelli.PixelCart.application.mapper;

import com.nicoladelli.PixelCart.application.dto.request.ProdutoRequest;
import com.nicoladelli.PixelCart.application.dto.response.ProdutoResponse;
import com.nicoladelli.PixelCart.domain.model.Produto;

public class ProdutoMapper {

    public static ProdutoResponse toDTO(Produto produto) {
        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getEstoque(),
                produto.getCategoria(),
                produto.getImagem_url()
        );
    }

    public static Produto toModel(ProdutoRequest dto) {
        Produto produto = new Produto();
        produto.setNome(dto.nome());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setEstoque(dto.estoque());
        produto.setCategoria(dto.categoria());
        produto.setImagem_url(dto.imagem_url());
        return produto;
    }

}