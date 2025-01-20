package com.rangelmrk.forumhub.domain.topico;

import com.rangelmrk.forumhub.domain.curso.Curso;
import com.rangelmrk.forumhub.domain.resposta.Resposta;
import com.rangelmrk.forumhub.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Boolean status,
        Usuario autor,
        Curso curso,
        List<Resposta> respostas) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespostas());
    }
}
