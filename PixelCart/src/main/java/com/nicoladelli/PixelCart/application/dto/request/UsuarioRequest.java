package com.nicoladelli.PixelCart.application.dto.request;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;

public record UsuarioRequest(

        @NotNull(message = "O nome não pode ser nulo")
        String nome,

        @NotBlank(message = "O email não pode ser nulo")
        @Email(message = "O email não é inválido!")
        String email,

        @CPF(message = "O CPF é inválido")
        @NotBlank(message = "O CPF não pode ser nulo")
        String cpf,

        @NotBlank(message = "Senha inválida!")
        String senha,


        @NotBlank(message = "O endereço não pode ser nulo")
        String endereco

) {
}
