CREATE TABLE tb_cliente(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
cpf VARCHAR(255) NOT NULL,
telefone VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
logradouro VARCHAR(255) NOT NULL,
numero VARCHAR(255) NOT NULL,
cep VARCHAR(8) NOT NULL,
complemento VARCHAR(255));