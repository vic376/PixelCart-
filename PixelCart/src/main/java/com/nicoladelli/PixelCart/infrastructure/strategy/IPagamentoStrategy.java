package com.nicoladelli.PixelCart.infrastructure.strategy;

import com.nicoladelli.PixelCart.application.dto.response.PagamentoResponseDTO;
import com.nicoladelli.PixelCart.domain.model.Pedido;

public interface IPagamentoStrategy {
    PagamentoResponseDTO processar(Pedido pedido);
}
