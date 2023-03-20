package br.com.duxusdesafio.service;

import java.time.LocalDate;

public class integrante {
    private String nome;
    private Comparable<LocalDate> DataFim;
    private Comparable<LocalDate> DataInicio;

    public Comparable<LocalDate> getDataInicio() {
        return this.DataInicio;
    }

    public Comparable<LocalDate> getDataFim() {
        return this.DataFim;
    }

    public String getNome() {
        return this.nome;
    }
}
