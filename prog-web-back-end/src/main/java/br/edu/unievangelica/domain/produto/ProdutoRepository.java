package br.edu.unievangelica.domain.produto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository {
    @Query("SELECT p FROM Produto p WHERE category.id =:category_id ORDER BY nome ASC")
    List<Produto> listarPorCategoria(@Param("category_id") long category_id);
}
