package com.javanauta.apiusuario.infrastructure.business;

import com.javanauta.apiusuario.infrastructure.business.converter.UsuarioConverter;
import com.javanauta.apiusuario.infrastructure.business.dto.UsuarioDTO;
import com.javanauta.apiusuario.infrastructure.entity.Usuario;
import com.javanauta.apiusuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }
}
