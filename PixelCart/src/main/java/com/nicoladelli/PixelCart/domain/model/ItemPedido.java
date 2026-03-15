package com.nicoladelli.PixelCart.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long pedido_id;

    @Column(nullable = false)
    private Long produto_id;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private double preco_unit;

}
