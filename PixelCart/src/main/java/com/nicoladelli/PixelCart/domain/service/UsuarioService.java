package com.nicoladelli.PixelCart.domain.service;

import com.nicoladelli.PixelCart.application.dto.request.UsuarioRequest;
import com.nicoladelli.PixelCart.domain.model.Usuario;
import com.nicoladelli.PixelCart.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario criarUsuario (Usuario usuario){
        return repository.save(usuario);
    }

    public void desativarUsuario(Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setAtivo(false);
        repository.save(usuario);
    }

    public Usuario atualizarUsuario(Long id, UsuarioRequest dto) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setCpf(dto.cpf());
        usuario.setSenha(dto.senha());
        usuario.setEndereco(dto.endereco());
        return repository.save(usuario);
    }


}
