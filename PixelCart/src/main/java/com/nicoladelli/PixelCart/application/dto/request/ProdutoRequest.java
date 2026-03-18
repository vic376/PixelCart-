package com.nicoladelli.PixelCart.application.dto.request;

import com.nicoladelli.PixelCart.domain.model.MetodoPagamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProdutoRequest(

        @NotNull(message = "O nome não pode ser nulo")
        String nome,

        @NotBlank(message = "A descrição não pode ser nula")
        String descricao,

        @Positive(message = "O preço deve ser maior que zero")
        BigDecimal preco,

        @PositiveOrZero(message = "O estoque não pode ser negativo")
        int estoque,

        @NotBlank(message = "A categoria não pode ser nula")
        String categoria,

        String imagem_url
) {

}
