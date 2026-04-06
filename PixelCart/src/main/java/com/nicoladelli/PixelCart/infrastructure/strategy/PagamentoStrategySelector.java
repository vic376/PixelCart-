package com.nicoladelli.PixelCart.infrastructure.strategy;

import com.nicoladelli.PixelCart.domain.model.MetodoPagamento;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PagamentoStrategySelector {

    private final Map<MetodoPagamento, IPagamentoStrategy> strategies;

    public PagamentoStrategySelector(PagamentoPixStrategy pix, PagamentoCartao cartao, PagamentoBoleto boleto) {
        strategies = Map.of(
                MetodoPagamento.PIX, pix,
                MetodoPagamento.CARTAO, cartao,
                MetodoPagamento.BOLETO, boleto
        );
    }

    public IPagamentoStrategy selecionar(MetodoPagamento metodo) {
        IPagamentoStrategy strategy = strategies.get(metodo);
        if (strategy == null) throw new RuntimeException("Método não suportado");
        return strategy;
    }
}
