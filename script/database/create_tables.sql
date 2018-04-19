-- script para criacao de tabelas no banco de dados
--
CREATE TABLE public.teste
(
    codigo integer NOT NULL,
    nome character varying(255),
    CONSTRAINT teste_pkey PRIMARY KEY (codigo)
)
-- As tabelas corretas devem ser criadas a partir daqui.
