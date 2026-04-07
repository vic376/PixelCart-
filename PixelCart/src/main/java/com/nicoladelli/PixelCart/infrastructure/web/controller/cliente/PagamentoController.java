package com.nicoladelli.PixelCart.infrastructure.web.controller.cliente;

import com.nicoladelli.PixelCart.application.dto.response.PagamentoResponseDTO;
import com.nicoladelli.PixelCart.domain.service.PagamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente/pagamentos")
@RequiredArgsConstructor
public class PagamentoController {

    private final PagamentoService pagamentoService;

    @PostMapping("/{pedidoId}")
    public ResponseEntity<PagamentoResponseDTO> processarPagamento(@PathVariable Long pedidoId) {
        PagamentoResponseDTO response = pagamentoService.processarPagamento(pedidoId);
        return ResponseEntity.ok(response);
    }
}
