package com.nicoladelli.PixelCart.infrastructure.web.controller.admin;

import com.nicoladelli.PixelCart.domain.model.Pedido;
import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.domain.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/pedidos")
@RequiredArgsConstructor
public class PedidoAdminController {

    private final PedidoService service;
    //private final PedidoRepository repository

    @GetMapping
    public List<Pedido> listarPedido (){
        return service.listarPedidos();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> buscarPedido(@PathVariable Long id) {
        return service.listarPorId(id);
    }



}
