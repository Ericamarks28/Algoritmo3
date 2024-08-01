package br.ufmt.alg3.curso;

public class Curso {
    private String nome;
    private String periodo; // matutino,vespertino,noturno
    private float nota; // Estrelas de 0 a 5
    private String comentario;
    private String rga;
    private String semestre; // 2024/1

    public Curso() {

    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public String getSemestre(){
        return semestre;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
