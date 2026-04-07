package com.nicoladelli.PixelCart.domain.service;

import com.nicoladelli.PixelCart.application.dto.response.PagamentoResponseDTO;
import com.nicoladelli.PixelCart.domain.model.Pedido;
import com.nicoladelli.PixelCart.infrastructure.repository.PedidoRepository;
import com.nicoladelli.PixelCart.infrastructure.strategy.IPagamentoStrategy;
import com.nicoladelli.PixelCart.infrastructure.strategy.PagamentoStrategySelector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PagamentoService {

    private final PagamentoStrategySelector selector;
    private final PedidoRepository repository;

    public PagamentoResponseDTO processarPagamento(Long id){
        Pedido pedido = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        IPagamentoStrategy strategy = selector.selecionar(pedido.getMetodoPagamento());
        PagamentoResponseDTO respondeDTO = strategy.processar(pedido);

        pedido.setMpPaymentId(respondeDTO.mpPaymentId());
        repository.save(pedido);

        return respondeDTO;
    }



}
