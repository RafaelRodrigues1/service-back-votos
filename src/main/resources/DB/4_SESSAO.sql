CREATE TABLE sessao
(
    id                    BINARY(16)   NOT NULL,
    id_pauta              BINARY(16)   NOT NULL,
    abertura              datetime     NOT NULL,
    encerramento          datetime     NOT NULL,
    status                VARCHAR(255) NOT NULL,
    id_motivo_invalidacao BINARY(16)   NULL,
    CONSTRAINT pk_sessao PRIMARY KEY (id)
);

ALTER TABLE sessao
    ADD CONSTRAINT uc_sessao_idmotivoinvalidacao UNIQUE (id_motivo_invalidacao);

ALTER TABLE sessao
    ADD CONSTRAINT FK_SESSAO_ON_IDMOTIVOINVALIDACAO FOREIGN KEY (id_motivo_invalidacao) REFERENCES motivo_invalidacao (id);

ALTER TABLE sessao
    ADD CONSTRAINT FK_SESSAO_ON_IDPAUTA FOREIGN KEY (id_pauta) REFERENCES pauta (id);
