CREATE TABLE resultado
(
    id        BINARY(16) NOT NULL,
    id_pauta  BINARY(16) NOT NULL,
    aprovada  BIT(1)     NOT NULL,
    voto_sim  INT        NOT NULL,
    voto_nao  INT        NOT NULL,
    abstencao INT        NOT NULL,
    quorum    INT        NOT NULL,
    CONSTRAINT pk_resultado PRIMARY KEY (id)
);

ALTER TABLE resultado
    ADD CONSTRAINT FK_RESULTADO_ON_IDPAUTA FOREIGN KEY (id_pauta) REFERENCES pauta (id);
