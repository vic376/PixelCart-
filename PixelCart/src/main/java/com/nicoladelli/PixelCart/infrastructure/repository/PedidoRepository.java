package com.nicoladelli.PixelCart.infrastructure.repository;

import com.nicoladelli.PixelCart.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}