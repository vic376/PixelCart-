package com.nicoladelli.PixelCart.infrastructure.web.controller.admin;

import com.nicoladelli.PixelCart.application.dto.request.ProdutoRequest;
import com.nicoladelli.PixelCart.domain.model.Produto;
import com.nicoladelli.PixelCart.domain.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoAdminController {
    private final ProdutoService service;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return service.criarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        service.deletarProduto(id);
    }

    @GetMapping
    public List<Produto> listarProduto (){
        return service.listarProduto();
    }

}
