package com.panda.happyday.controller;


import com.panda.happyday.entity.Agenda;
import com.panda.happyday.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Agenda")
public class AgendaController {
    @Autowired
    private AgendaService agendaService ;

    @PostMapping
    public ResponseEntity<Agenda> salvarAgenda(@RequestBody Agenda Agenda){
        return ResponseEntity.ok(agendaService.salvarAgenda(Agenda));
    }

    @GetMapping
    public ResponseEntity<Agenda> buscarAgenda(@RequestParam Long id){
        return ResponseEntity.ok(agendaService.buscarAgenda(id));
    }

    @PutMapping
    public ResponseEntity<Agenda> editarAgenda(@RequestBody  Agenda agenda){
        return ResponseEntity.ok(agendaService.editarAgenda(agenda));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAgenda(@RequestParam Long id){
       agendaService.deleteAgenda(id);
        return ResponseEntity.noContent().build();
    }
}
