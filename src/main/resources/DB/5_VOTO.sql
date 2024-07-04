CREATE TABLE voto
(
    id           BINARY(16)   NOT NULL,
    id_sessao    BINARY(16)   NOT NULL,
    id_associado BINARY(16)   NOT NULL,
    tipo         VARCHAR(255) NOT NULL,
    CONSTRAINT pk_voto PRIMARY KEY (id)
);

ALTER TABLE voto
    ADD CONSTRAINT FK_VOTO_ON_IDASSOCIADO FOREIGN KEY (id_associado) REFERENCES associado (id);

ALTER TABLE voto
    ADD CONSTRAINT FK_VOTO_ON_IDSESSAO FOREIGN KEY (id_sessao) REFERENCES sessao (id);
