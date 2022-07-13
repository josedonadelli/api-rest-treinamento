package gft.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.entities.Produto;
import gft.exception.EntityNotFoundException;
import gft.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public Page<Produto> listarProdutos(Pageable pageable) {
		return produtoRepository.findAll(pageable);
	}

	public Produto buscarProduto(Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElseThrow(() -> new EntityNotFoundException("Produto não encontrado."));
	}

	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public Produto alterarProduto(Produto produto, Long id) {
		Produto original = buscarProduto(id);
		produto.setId(original.getId());
		return produtoRepository.save(produto);
	}

	public void excluirProduto(Long id) {
		Produto produto = buscarProduto(id);

		produtoRepository.delete(produto);
	}
}
