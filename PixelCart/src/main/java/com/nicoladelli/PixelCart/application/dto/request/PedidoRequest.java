package com.nicoladelli.PixelCart.application.dto.request;

import com.nicoladelli.PixelCart.domain.model.MetodoPagamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public record PedidoRequest(

        @NotNull
        List<ItemPedidoRequest> itens,

        @NotNull(message = "O Método de pagamento não pode ser nulo")
        MetodoPagamento metodoPagamento

) {


}
