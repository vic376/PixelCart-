package com.nicoladelli.PixelCart.domain.service;

import com.nicoladelli.PixelCart.application.dto.request.UsuarioRequest;
import com.nicoladelli.PixelCart.domain.model.Usuario;
import com.nicoladelli.PixelCart.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario criarUsuario (Usuario usuario){
        return repository.save(usuario);
    }

    public void deletarUsuario (Long id){
         repository.deleteById(id);
    }

//criar um update
}
