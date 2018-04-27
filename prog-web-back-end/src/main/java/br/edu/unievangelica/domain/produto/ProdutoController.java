package br.edu.unievangelica.domain.produto;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController extends ResponseAbstractController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{categoryId}")
    public ResponseEntity<?> listarProduto(@PathVariable("categoryId") long categoryId){
        return jsonResponse(produtoService.listarPorCategoria(categoryId));
    }
}
