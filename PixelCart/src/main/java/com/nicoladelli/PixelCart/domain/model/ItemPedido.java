package com.nicoladelli.PixelCart.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

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

    /*@Column(nullable = false)
    private Long pedido_id;*/

   /* @Column(nullable = false)
    private Long produto_id;*/

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private BigDecimal preco_unit;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;


}
