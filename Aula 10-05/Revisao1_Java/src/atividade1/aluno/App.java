package atividade1.aluno;

public class App {
    public static void main(String[] args) {
        
        //Na classe principal main declare uma variável do tipo da classe e crie uma instância da mesma (ou seja, um objeto). Insira valores em cada um dos campos do objeto e os imprima em seguida.
        Livro livro1 = new Livro(2014, "O nascimento de delta", "Vozes da minha cabeça");

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAno());
    }
}
