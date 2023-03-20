package br.com.duxusdesafio.controller;


import br.com.duxusdesafio.model.Time;
import br.com.duxusdesafio.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")

public class TimeController {

    @Autowired
    private TimeRepository timeRepository;

    //Definindo um endpoint para listar os times
    @GetMapping("/times")
    public List<Time> listar(){
        return timeRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public Time adicionarTime(@RequestBody Time time){
        return timeRepository.save(time);
    }

}
