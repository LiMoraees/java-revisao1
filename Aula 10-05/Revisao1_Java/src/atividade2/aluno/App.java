package atividade2.aluno;

public class App {
    public static void main(String[] args) {
        
        //Criando objeto Autor
        Autor autor1 = new Autor("Moraes, Livia", "livia@email.com", 'F');

        //Criando objeto Livro com o construtor sem quantidade de livro
        Livro livro1 = new Livro("Noguers", autor1, 27.90);

        System.out.println("Dados do livro 1: ");
        System.out.println("Nome Livro: " + livro1.getNome());
        System.out.println("Nome Autor: " + livro1.getAutor().getNome());
        System.out.println("Preço: " + livro1.getPreco());

        //Criando objeto Livro com o construtor com quantidade de livro
        Livro livro2 = new Livro("Proguers", autor1, 30.50, 30);

        System.out.println("Dados do livro 2: ");
        System.out.println("Nome Livro: " + livro2.getNome());
        System.out.println("Nome Autor: " + livro2.getAutor().getNome());
        System.out.println("Preço: " + livro2.getPreco());
        System.out.println("Quantidade disponível: " + livro2.getQuantidade());
    }
}
