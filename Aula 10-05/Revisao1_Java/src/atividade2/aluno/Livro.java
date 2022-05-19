package atividade2.aluno;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;
    private int quantidade;
    
    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String nome, Autor autor, double preco, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
