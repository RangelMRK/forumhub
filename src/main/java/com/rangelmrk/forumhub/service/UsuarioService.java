package com.rangelmrk.forumhub.service;


import com.rangelmrk.forumhub.domain.usuario.DadosCadastroUsuario;
import com.rangelmrk.forumhub.domain.usuario.Usuario;
import com.rangelmrk.forumhub.domain.usuario.UsuarioRepository;
import com.rangelmrk.forumhub.domain.usuario.perfil.Perfil;
import com.rangelmrk.forumhub.domain.usuario.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerfilRepository perfilRepository;

    @Autowired
    private PasswordEncoder encoder;



    public Usuario criarUsuario(DadosCadastroUsuario dados) {
        if(usuarioRepository.findByEmail(dados.email()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado!");
        }

        // Criar o usuário
        Usuario usuario = new Usuario();
        usuario.setNome(dados.nome());
        usuario.setEmail(dados.email());
        usuario.setSenha(encoder.encode(dados.senha()));

        // Criar o perfil padrão
        Perfil perfil = new Perfil();
        perfil.setNome(dados.nome());
        perfil = perfilRepository.save(perfil);

        // Associar o perfil ao usuário
        Set<Perfil> perfis = new HashSet<>();
        perfis.add(perfil);
        usuario.setPerfis(perfis);


        return usuario;
    }
}
