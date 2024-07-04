CREATE TABLE pauta
(
    id           BINARY(16)   NOT NULL,
    descricao    VARCHAR(255) NOT NULL,
    id_associado BINARY(16)   NOT NULL,
    CONSTRAINT pk_pauta PRIMARY KEY (id)
);

ALTER TABLE pauta
    ADD CONSTRAINT uc_pauta_descricao UNIQUE (descricao);

ALTER TABLE pauta
    ADD CONSTRAINT FK_PAUTA_ON_IDASSOCIADO FOREIGN KEY (id_associado) REFERENCES associado (id);
