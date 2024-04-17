package com.panda.happyday.service;

import com.panda.happyday.entity.Usuarios;
import com.panda.happyday.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuarios salvarUsuario(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    public Usuarios buscarUsuario(Long id){
        Optional<Usuarios> usuarios = usuariosRepository.findById(id);

        if(usuarios.isEmpty())
            throw new RuntimeException("Usuario não encontrado");

        return usuarios.get();
    }

    public Usuarios editarUsuario(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }

    public void deleteUsuario(Long id){
         usuariosRepository.deleteById(id);
    }
}


