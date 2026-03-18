package com.nicoladelli.PixelCart.application.mapper;

import com.nicoladelli.PixelCart.application.dto.request.UsuarioRequest;
import com.nicoladelli.PixelCart.application.dto.response.UsuarioResponse;
import com.nicoladelli.PixelCart.domain.model.Usuario;

public class UsuarioMapper {

    public static UsuarioResponse toDTO (Usuario usuario){
        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCpf(),
                usuario.getEndereco()


        );
    }

    public static Usuario toModel (UsuarioRequest dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setCpf(dto.cpf());
        usuario.setEndereco(dto.endereco());


        return usuario;
    }

}
/*

    public static Produto toModel(ProdutoRequest dto) {
        Produto produto = new Produto();
        produto.setNome(dto.nome());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setEstoque(dto.estoque());
        produto.setCategoria(dto.categoria());
        produto.setImagem_url(dto.imagem_url());
        return produto;
    }


        String nome,
        String email,
        String cpf,
        String senha,)
        String endereco

} */