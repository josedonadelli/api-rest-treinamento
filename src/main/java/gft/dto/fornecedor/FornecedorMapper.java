package gft.dto.fornecedor;

import gft.entities.Fornecedor;

public class FornecedorMapper {

	public static Fornecedor fromDTO(RegistroFornecedorDTO dto) {
		return new Fornecedor(null, dto.getCnpj(), dto.getNome(), dto.getTelefone(), dto.getEmail(), dto.getEndereco());
	}
	
	public static ConsultaFornecedorDTO fromEntity(Fornecedor fornecedor) {
		return new ConsultaFornecedorDTO(fornecedor.getId(), fornecedor.getCnpj(), fornecedor.getNome(), fornecedor.getTelefone(), fornecedor.getEmail(), fornecedor.getEndereco());
	}
}
