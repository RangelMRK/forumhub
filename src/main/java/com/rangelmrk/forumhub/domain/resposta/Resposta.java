package com.rangelmrk.forumhub.domain.resposta;

import com.rangelmrk.forumhub.domain.topico.Topico;
import com.rangelmrk.forumhub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


@Entity(name = "Resposta")
@Table(name = "resposta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private Boolean solucao;
    @ManyToOne
    private Usuario autor;
    @ManyToOne
    private Topico topico;
}
