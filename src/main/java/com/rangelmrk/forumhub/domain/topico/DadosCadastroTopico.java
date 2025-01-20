package com.rangelmrk.forumhub.domain.topico;

import com.rangelmrk.forumhub.domain.curso.Curso;
import com.rangelmrk.forumhub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;


public record DadosCadastroTopico(

        @NotBlank(message = "Titulo é obrigatório")
        String titulo,

        @NotBlank(message = "Conteúdo é obrigatório")
        String mensagem,

        @NotBlank(message = "Usuário é obrigatório")
        Usuario autor,

        @NotBlank(message = "Curso é obrigatório")
        Curso curso
) {
}
