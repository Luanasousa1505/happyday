package com.panda.happyday.controller;
import com.panda.happyday.entity.Perfil;
import com.panda.happyday.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Perfil")
public class PerfilController {

    @Autowired
    private PerfilService perfilService ;

    @PostMapping
    public ResponseEntity<Perfil> salvarPerfil(@RequestBody Perfil perfil){
        return ResponseEntity.ok(perfilService.salvarPerfil(perfil));
    }

    @GetMapping
    public ResponseEntity<Perfil> buscarPerfil(@RequestParam Long id){
        return ResponseEntity.ok(perfilService.buscarPerfil(id));
    }

    @PutMapping
    public ResponseEntity<Perfil> editarPerfil(@RequestBody  Perfil perfil){
        return ResponseEntity.ok(perfilService.editarPerfil(perfil));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePerfil(@RequestParam Long id){
        perfilService.deletePerfil(id);
        return ResponseEntity.noContent().build();
    }

}
