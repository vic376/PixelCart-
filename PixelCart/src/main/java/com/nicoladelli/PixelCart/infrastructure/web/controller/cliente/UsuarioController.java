package com.nicoladelli.PixelCart.infrastructure.web.controller.cliente;

import com.nicoladelli.PixelCart.application.dto.request.UsuarioRequest;
import com.nicoladelli.PixelCart.domain.model.Usuario;
import com.nicoladelli.PixelCart.domain.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    @PostMapping
    public Usuario criarUsuario (@RequestBody Usuario usuario){
        return service.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void desativarUsuario(@PathVariable Long id){
        service.desativarUsuario(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioRequest dto){
        return service.atualizarUsuario(id, dto);
    }

}
