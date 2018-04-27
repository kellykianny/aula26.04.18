package br.edu.unievangelica.domain.produto;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarPorCategoria(long categoryId) {
        return produtoRepository.listarPorCategoria(categoryId);
    }
}
