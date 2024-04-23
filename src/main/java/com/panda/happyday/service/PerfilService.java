package com.panda.happyday.service;

import com.panda.happyday.entity.Perfil;
import com.panda.happyday.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil salvarPerfil(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    public Perfil buscarPerfil (Long id){
        Optional<Perfil> perfil = perfilRepository.findById(id);

        if(perfil.isEmpty())
            throw new RuntimeException("Perfil não encontrado");

        return perfil.get();
    }

    public Perfil editarPerfil(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    public void deletePerfil(Long id){
        perfilRepository.deleteById(id);
    }

}
