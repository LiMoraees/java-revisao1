package atividade2.aluno;

public class Autor {
    private String nome;
    private String email;
    private char genero;
    
    public Autor(String nome, String email, char genero) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    
}
