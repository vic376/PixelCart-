package com.nicoladelli.PixelCart.infrastructure.web.controller.admin;

import com.nicoladelli.PixelCart.domain.model.Pedido;
import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.domain.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoAdminController {

    private final PedidoService service;
    //private final PedidoRepository repository

    @GetMapping
    public List<Pedido> listarPedido (){
        return service.listarPedidos();
    }



}
