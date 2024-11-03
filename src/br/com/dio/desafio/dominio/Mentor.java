package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Mentor  {
    private String nome;
    private Set<Conteudo> materia = new HashSet<>();

    public void addMateria(Conteudo materia){
        this.materia.add(materia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMateria() {
        return materia;
    }

    public void setMateria(Set<Conteudo> materia) {
        this.materia = materia;
    }

}
