package com.nicoladelli.PixelCart.application.mapper;

import com.nicoladelli.PixelCart.application.dto.request.PedidoRequest;
import com.nicoladelli.PixelCart.application.dto.response.ItemPedidoResponse;
import com.nicoladelli.PixelCart.application.dto.response.PedidoResponse;
import com.nicoladelli.PixelCart.domain.model.Pedido;

import java.util.List;

public class PedidoMapper {

    public static PedidoResponse toDTO (Pedido pedido){
        List<ItemPedidoResponse> itens = pedido.getItens()
                .stream()
                .map(item -> new ItemPedidoResponse(
                        item.getProduto().getNome(),
                        item.getQuantidade(),
                        item.getPreco_unit()
                ))
                .toList();
        return new PedidoResponse(
          pedido.getId(),
          pedido.getNumero_pedido(),
          pedido.getTotal(),
          pedido.getStatusPedido(),
          pedido.getMetodoPagamento(),
          pedido.getCriacaoPedido(),
        itens
        );
    }

    public static Pedido toModel (PedidoRequest dto){
        Pedido pedido = new Pedido();
        pedido.setMetodoPagamento(dto.metodoPagamento());
        return pedido;
    }
}
