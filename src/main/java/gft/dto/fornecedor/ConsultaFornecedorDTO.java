package gft.dto.fornecedor;

import gft.entities.Endereco;

public class ConsultaFornecedorDTO {

	private Long id;

	private String cnpj;
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;

	public ConsultaFornecedorDTO() {

	}

	public ConsultaFornecedorDTO(Long id, String cnpj, String nome, String telefone, String email, Endereco endereco) {

		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
