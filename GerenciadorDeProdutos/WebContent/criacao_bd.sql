CREATE DATABASE web_produtos;

USE web_produtos;

CREATE TABLE produto (
	codigo INT NOT NULL PRIMARY KEY,
    nome VARCHAR(256) NOT NULL,
    descricao TEXT,
    valor DOUBLE,
    estoque INT
);