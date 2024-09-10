package com.iff.devweb.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@DiscriminatorValue("2")
public class Treinador extends Usuario implements Serializable {

    @Column
    private String especialidade;

    @Column
    private String registroProf;

    @Column
    private LocalDate dataContratacao;

    @OneToMany(mappedBy = "treinador")
    private List<Aluno> aluno;

    public Treinador() {

    }

    public Treinador(Long id, String nome, String email, LocalDate dataNasc, String tel, String endereco, LocalDateTime dataCadastro, String especialidade, String registroProf, LocalDate dataContratacao, List<Aluno> aluno) {
        super(id, nome, email, dataNasc, tel, endereco, dataCadastro);
        this.especialidade = especialidade;
        this.registroProf = registroProf;
        this.dataContratacao = dataContratacao;
        this.aluno = aluno;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(String registroProf) {
        this.registroProf = registroProf;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }
}
