-- src/main/resources/import.sql
INSERT INTO livro (id, titulo, autor, editora, ano,  quantidade_total, quantidade_disponivel, isbn) VALUES (1, '1984',                  'George Orwell', 'Secker and Warburg',    1949,  10, 8, '1234567890');
INSERT INTO livro (id, titulo, autor, editora, ano,  quantidade_total, quantidade_disponivel, isbn) VALUES (2, 'To Kill a Mockingbird', 'Harper Lee',    'J.B. Lippincott & Co.', 1960,   8, 6, '1234567891');

ALTER TABLE livro ALTER COLUMN id RESTART WITH (SELECT MAX(id) FROM livro) + 1;


INSERT INTO usuario (id, nome, email, senha, tipo_usuario) VALUES (1,'João Silva', 'joao.silva@example.com', '$2a$10$NljmOv7yytCgn2MOkD0Otun8b.6bWj3Wxq1SUbhvRdUYBYjKqeudm', 'Estudante');
INSERT INTO usuario (id, nome, email, senha, tipo_usuario) VALUES (2,'Maria Oliveira', 'maria.oliveira@example.com', '$2a$10$NljmOv7yytCgn2MOkD0Otun8b.6bWj3Wxq1SUbhvRdUYBYjKqeudm', 'Professor');
INSERT INTO usuario (id, nome, email, senha, tipo_usuario) VALUES (3,'Carlos Pereira', 'carlos.pereira@example.com', '$2a$10$NljmOv7yytCgn2MOkD0Otun8b.6bWj3Wxq1SUbhvRdUYBYjKqeudm', 'Administrador');
INSERT INTO usuario (id, nome, email, senha, tipo_usuario) VALUES (4,'Ana Costa', 'ana.costa@example.com', '$2a$10$NljmOv7yytCgn2MOkD0Otun8b.6bWj3Wxq1SUbhvRdUYBYjKqeudm', 'Estudante');
INSERT INTO usuario (id, nome, email, senha, tipo_usuario) VALUES (5,'Luiz Santos', 'luiz.santos@example.com', '$2a$10$NljmOv7yytCgn2MOkD0Otun8b.6bWj3Wxq1SUbhvRdUYBYjKqeudm', 'Professor');

ALTER TABLE usuario ALTER COLUMN id RESTART WITH (SELECT MAX(id) FROM usuario) + 1;


-- src/main/resources/import.sql
-- ... (previous insert statements for Livro and Usuario)

-- Insert Emprestimo records
INSERT INTO emprestimo (id, usuario_id, livro_id, data_emprestimo, data_devolucao, tipo_emprestimo) VALUES (1, 1, 1, '2023-01-01', '2023-01-15', 'Estudante');

INSERT INTO emprestimo (id, usuario_id, livro_id, data_emprestimo, data_devolucao, tipo_emprestimo) VALUES (2, 2, 1, '2023-01-02', '2023-01-16', 'Professor');

INSERT INTO emprestimo (id, usuario_id, livro_id, data_emprestimo, data_devolucao, tipo_emprestimo) VALUES (3, 4, 2, '2023-01-03', '2023-01-17', 'Estudante');

INSERT INTO emprestimo (id, usuario_id, livro_id, data_emprestimo, data_devolucao, tipo_emprestimo) VALUES (4, 5, 2, '2023-01-04', '2023-01-18', 'Professor');

-- Restart Emprestimo id sequence
ALTER TABLE emprestimo ALTER COLUMN id RESTART WITH (SELECT MAX(id) FROM emprestimo) + 1;
