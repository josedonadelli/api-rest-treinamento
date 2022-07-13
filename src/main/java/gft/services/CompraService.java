package gft.services;

import org.springframework.stereotype.Service;

import gft.entities.Compra;
import gft.entities.Endereco;
import gft.entities.Filial;
import gft.repositories.CompraRepository;

@Service
public class CompraService {
	private final CompraRepository compraRepository;
	private final EstoqueService estoqueService;

	public CompraService(CompraRepository compraRepository, EstoqueService estoqueService) {
		this.compraRepository = compraRepository;
		this.estoqueService = estoqueService;
	}

	public Compra salvarCompra(Compra compra) {
		// Rever depois de assistir aula 5 SpringSecurity
		Endereco endereco = new Endereco("Rua Boa Morte", "222", "Apto 2323", "123456");
		compra.setFilial(new Filial(null, "Filial A", endereco));
		
		compra.getItens().stream().forEach(i -> estoqueService.acrescentaQuantidadeEstoque(i.getProduto().getId(), compra.getFilial().getId(), i.getQuantidade()));
		return compraRepository.save(compra);
	}

}
