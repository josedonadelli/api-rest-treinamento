package gft.dto.cliente;

import gft.entities.Cliente;

public class ClienteMapper {

	public static Cliente fromDTO(RegistroClienteDTO dto) {
		return new Cliente(null, dto.getNome(), dto.getCpf(), dto.getTelefone(), dto.getEmail(), dto.getEndereco());
	}
	public static ConsultaClienteDTO fromEntity(Cliente cliente) {
		return new ConsultaClienteDTO(cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getEmail(), cliente.getEndereco());
	}
}
