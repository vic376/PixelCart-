package com.nicoladelli.PixelCart.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String numero_pedido;

    @Column(nullable = false)
    private Long usuario_id;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private StatusPedido statusPedido;

    @Column(nullable = false)
    private MetodoPagamento metodoPagamento;

    @Column(nullable = false)
    private String mpPaymentId;

    @Column(nullable = false)
    private Date criacaoPedido;


}
