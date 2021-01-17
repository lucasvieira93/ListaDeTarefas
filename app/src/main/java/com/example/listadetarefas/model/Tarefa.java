package com.example.listadetarefas.model;

public class Tarefa {

    private Long id;
    private String nomeTarefa;

    public Tarefa() {
    }

    public Tarefa(Long id, String nomeTarefa) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}
