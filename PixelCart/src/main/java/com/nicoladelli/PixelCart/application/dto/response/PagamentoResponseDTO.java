package com.nicoladelli.PixelCart.application.dto.response;

public record PagamentoResponseDTO(
        String status,
        String mpPaymentId,  // ID do MP, usado internamente pelo service
        String qrCode,       // PIX
        String copiaCola,    // PIX
        String urlBoleto,    // Boleto
        String codigoBarras, // Boleto
        String mensagem      // Cartão / erros
) {
}
