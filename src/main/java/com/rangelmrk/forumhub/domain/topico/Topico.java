package com.rangelmrk.forumhub.domain.topico;

import com.rangelmrk.forumhub.domain.curso.Curso;
import com.rangelmrk.forumhub.domain.resposta.Resposta;
import com.rangelmrk.forumhub.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Topico")
@Table(name = "topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private Boolean status;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Curso curso;

    @OneToMany(mappedBy = "topico")
    private List<Resposta> respostas;

    public void excluir() {
        this.status = false;
    }

}
