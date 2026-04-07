package com.nicoladelli.PixelCart.infrastructure.strategy;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.payment.Payment;
import com.nicoladelli.PixelCart.application.dto.response.PagamentoResponseDTO;
import com.nicoladelli.PixelCart.domain.model.Pedido;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PagamentoPixStrategy implements IPagamentoStrategy{

    @Value("${mercadopago.access-token}")
    private String accessToken;

    @Override
    public PagamentoResponseDTO processar(Optional<Pedido> pedido){
        MercadoPagoConfig.setAccessToken(accessToken);

        PaymentCreateRequest request = PaymentCreateRequest.builder()
                .transactionAmount(pedido.getTotal())
                .description("Pedido " + pedido.getNumero_pedido())
                .paymentMethodId("pix")
                .payer(PaymentPayerRequest.builder()
                       .email(pedido.getUsuario().getEmail())
                       .build())
                .build();
        try{
            PaymentClient client = new PaymentClient();
            Payment payment = client.create(request);

            return new PagamentoResponseDTO(
                    payment.getStatus(),
                    String.valueOf(payment.getId()),
                    payment.getPointOfInteraction()
                            .getTransactionData().getQrCode(),
                    payment.getPointOfInteraction()
                            .getTransactionData().getQrCodeBase64(),
                    null,
                    null,
                    "PIX gerado com sucesso"
            );
        } catch (MPException | MPApiException e) {
            throw new RuntimeException("Erro ao gerar PIX: "+e.getMessage());
        }

    }
}
