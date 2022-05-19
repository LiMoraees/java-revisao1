package atividade1.aluno;

public class Livro {
    //Crie três atributos: ano, do tipo int; título, do tipo String; autor do tipo String.

    private int ano;
    private String autor, titulo;

    public Livro(int ano, String titulo, String autor) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
}
