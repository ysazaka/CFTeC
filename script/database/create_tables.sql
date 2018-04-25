-- script para criacao de tabelas no banco de dados
--
--antes de cada tabela o nome do responsavel deve ser informado

--Responsavel: Alexandre L Erario
CREATE TABLE public.teste
(
    codigo integer NOT NULL,
    nome character varying(255),
    CONSTRAINT teste_pkey PRIMARY KEY (codigo)
)
-- As tabelas corretas devem ser criadas a partir daqui.
--Responsavel: Diego Vilella
CREATE TABLE public.message(
    codigo integer NOT NULL,
     CONSTRAINT mensage_pkey PRIMARY KEY (codigo)
)


-- Responsavel Sirnande dos Santos Lima
CREATE  TABLE  public .project (
)


-- Responsavel Danilo Missao Morita
CREATE TABLE public.host (
    codigo integer NOT NULL,
    Constraint cod_pkey PRIMARY KEY (codigo)
)
