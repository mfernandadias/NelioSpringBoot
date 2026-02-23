----------------------------------------
-- CATEGORIA
----------------------------------------

INSERT INTO tb_categoria ( descricao, id) VALUES ( 'Curso', 1);
INSERT INTO tb_categoria ( descricao, id) VALUES  ('Oficina', 2);

--atividade---
INSERT INTO tb_atividade (name, descricao, preco, categoria_id) VALUES ('Curso de HTML', 'Aprenda HTML de forma prática', 80.0, 1);
INSERT INTO tb_atividade (name, descricao, preco, categoria_id) VALUES ('Oficiona de Github', 'controle versões de seus projetos', 50.0, 2);

---Participante----
INSERT INTO tb_participante (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (name, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

---bloco----
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (1, '2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (2, '2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (3, '2017-09-26T08:00:00Z', '2017-09-26T11:00:00Z', 2);