
CREATE DATABASE web_professores;

USE web_professores;

CREATE TABLE professor (
	matricula INT PRIMARY KEY NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    nome VARCHAR(126) NOT NULL,
    endereco VARCHAR(200)
);
