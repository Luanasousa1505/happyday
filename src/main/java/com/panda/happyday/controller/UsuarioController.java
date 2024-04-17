package com.panda.happyday.controller;
import com.panda.happyday.entity.Usuarios;
import com.panda.happyday.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuarios> salvarUsuario(@RequestBody Usuarios usuarios){
        return ResponseEntity.ok(usuarioService.salvarUsuario(usuarios));
    }

    @GetMapping
    public ResponseEntity<Usuarios> buscarUsuario(@RequestParam Long id){
        return ResponseEntity.ok(usuarioService.buscarUsuario(id));
    }

    @PutMapping
    public ResponseEntity<Usuarios> editarUsuario(@RequestBody Usuarios usuarios){
        return ResponseEntity.ok(usuarioService.editarUsuario(usuarios));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUsuario(@RequestParam Long id){
        usuarioService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
