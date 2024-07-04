CREATE TABLE motivo_invalidacao
(
    id        BINARY(16)   NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    CONSTRAINT pk_motivo_invalidacao PRIMARY KEY (id)
);
