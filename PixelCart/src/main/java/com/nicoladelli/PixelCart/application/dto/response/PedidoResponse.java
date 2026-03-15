package com.nicoladelli.PixelCart.application.dto.response;

import com.nicoladelli.PixelCart.domain.model.MetodoPagamento;
import com.nicoladelli.PixelCart.domain.model.StatusPedido;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public record PedidoResponse(

        Long id,
        String numero_pedido,
        BigDecimal total,
        StatusPedido statusPedido,
        MetodoPagamento metodoPagamento,
        LocalDateTime criacaoPedido,
        List<ItemPedidoResponse> itens
) {
}


