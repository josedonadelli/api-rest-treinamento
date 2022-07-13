package gft.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.entities.Fornecedor;
import gft.exception.EntityNotFoundException;
import gft.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	private final FornecedorRepository fornecedorRepository;

	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}

	public Page<Fornecedor> listarFornecedores(Pageable pageable) {

		return fornecedorRepository.findAll(pageable);
	}

	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

	public Fornecedor buscarFornecedor(Long id) {

		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);

		return fornecedor.orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado"));
	}

	public Fornecedor atualizarFornecedor(Fornecedor fornecedor, Long id) {
		Fornecedor original = buscarFornecedor(id);

		fornecedor.setId(original.getId());
		return fornecedorRepository.save(fornecedor);

	}

	public void excluirFornecedor(Long id) {
		Fornecedor fornecedor = buscarFornecedor(id);
		fornecedorRepository.delete(fornecedor);
	}
}
