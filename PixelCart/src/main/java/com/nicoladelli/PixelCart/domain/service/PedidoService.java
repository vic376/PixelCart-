package com.nicoladelli.PixelCart.domain.service;

import com.nicoladelli.PixelCart.application.dto.response.PedidoResponse;
import com.nicoladelli.PixelCart.domain.model.Pedido;
import com.nicoladelli.PixelCart.infrastructure.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PedidoService {

    private final PedidoRepository repository;


    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido criarPedido (Pedido pedido){
        return repository.save(pedido);
    }
//response dps
    public List<Pedido> listarPedidos (){
        return repository.findAll();
    }//só eu vejo

    public Optional<Pedido> listarPorId (Long id){
        return repository.findById(id);
    }
    
}
