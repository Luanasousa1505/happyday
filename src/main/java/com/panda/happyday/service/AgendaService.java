package com.panda.happyday.service;


import com.panda.happyday.entity.Agenda;
import com.panda.happyday.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;



    public Agenda salvarAgenda(Agenda agenda){
        return agendaRepository.save(agenda);
    }

    public Agenda buscarAgenda(Long id){
        Optional<Agenda> agenda = agendaRepository.findById(id);

        if(agenda.isEmpty())
            throw new RuntimeException("A agenda esta vazia.");

        return agenda.get();
    }

    public Agenda editarAgenda(Agenda agenda){
        return agendaRepository.save(agenda);
    }

    public void deleteAgenda(Long id){
        agendaRepository.deleteById(id);
    }
}
