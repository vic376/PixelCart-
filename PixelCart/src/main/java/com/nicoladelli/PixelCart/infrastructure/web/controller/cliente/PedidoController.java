package com.nicoladelli.PixelCart.infrastructure.web.controller.cliente;

import com.nicoladelli.PixelCart.domain.model.Pedido;
import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.domain.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientepedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido){
        return service.criarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Optional<Pedido> buscarPedido(@PathVariable Long id) {
        return service.listarPorId(id);
    }

}



