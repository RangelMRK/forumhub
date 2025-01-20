CREATE TABLE resposta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mensagem TEXT NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    topico_id BIGINT NOT NULL,
    autor_id BIGINT NOT NULL,
    solucao BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (topico_id) REFERENCES topico(id),
    FOREIGN KEY (autor_id) REFERENCES usuario(id)
);