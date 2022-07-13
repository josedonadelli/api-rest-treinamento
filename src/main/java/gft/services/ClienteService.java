package gft.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.entities.Cliente;
import gft.exception.EntityNotFoundException;
import gft.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Page<Cliente> listarClientes(Pageable pageable) {
		return clienteRepository.findAll(pageable);
	}

	public Cliente buscarCliente(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		return cliente.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
	}

	public Cliente atualizarCliente(Cliente cliente, Long id) {
		Cliente original = buscarCliente(id);

		cliente.setId(original.getId());
		return clienteRepository.save(cliente);
	}

	public void excluirCliente(Long id) {
		Cliente cliente = buscarCliente(id);
		clienteRepository.delete(cliente);
	}
}
