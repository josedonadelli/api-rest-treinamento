package gft.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.entities.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
	
	Optional<Estoque> findByProduto_IdAndFilial_Id(Long produtoId, Long filialId);
}
