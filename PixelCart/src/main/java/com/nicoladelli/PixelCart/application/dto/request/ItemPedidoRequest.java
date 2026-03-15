package com.nicoladelli.PixelCart.application.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ItemPedidoRequest(

        @NotNull
        Long produtoId,

        @Positive
        int quantidade


) {
}
