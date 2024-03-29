package gft.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Page<Produto> findAll(Pageable pageable);
}
