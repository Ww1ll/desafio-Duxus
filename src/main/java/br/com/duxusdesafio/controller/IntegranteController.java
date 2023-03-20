package br.com.duxusdesafio.controller;

import br.com.duxusdesafio.model.Integrante;
import br.com.duxusdesafio.model.Time;
import br.com.duxusdesafio.repository.IntegranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cadastro")
public class IntegranteController {

    @Autowired
    private IntegranteRepository integranteRepository;

    //Definindo um endpoint para listar os integrantes
    @GetMapping("/integrantes")
    public List<Integrante> listar(){
        return integranteRepository.findAll();
    }


    //A expectativa seria de que, por meio dessa annotation a possibilidade
    //adicionar um novo integrante
    @PostMapping
    @ResponseBody
    public Integrante adicionarIntegrante(@RequestBody Integrante integrante){
        return integranteRepository.save(integrante);
    }
    //A annotation ResponseBody retornaria um objeto em formato JSON

}
