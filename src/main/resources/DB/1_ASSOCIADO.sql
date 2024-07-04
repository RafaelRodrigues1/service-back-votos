CREATE TABLE associado
(
    id   BINARY(16)   NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cpf  VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    CONSTRAINT pk_associado PRIMARY KEY (id)
);

ALTER TABLE associado
    ADD CONSTRAINT uc_associado_cpf UNIQUE (cpf);
