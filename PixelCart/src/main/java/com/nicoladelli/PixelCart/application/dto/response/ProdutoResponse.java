package com.nicoladelli.PixelCart.application.dto.response;

import com.nicoladelli.PixelCart.domain.model.MetodoPagamento;
import com.nicoladelli.PixelCart.domain.model.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProdutoResponse(

        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        int estoque,
        String categoria,
        String imagem_url
) {
}
