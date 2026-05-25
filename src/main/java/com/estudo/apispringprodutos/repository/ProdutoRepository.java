package com.estudo.apispringprodutos.repository;

import com.estudo.apispringprodutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Diz ao Spring que este componente gerencia o acesso aos dados
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Pronto! Só com essa linha, o Spring já criou o seu CRUD completo por trás dos panos.
}