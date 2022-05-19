package atividade1.professor;

public class App {
    public static void main(String[] args) throws Exception {

        //declare uma variável do tipo classe criada
        Jogador jogador1 = new Jogador();

        //Inserindo valores no objeto Jogador 
        jogador1.setNome("Jogador 1");
        jogador1.setPontuacao(500);
        jogador1.setAtivado(true);

        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getPontuacao());
        System.out.println(jogador1.isAtivado());

        Jogador jogador2 = new Jogador(200, "Jogador 2", false);

        System.out.println(jogador2.getNome());
        System.out.println(jogador2.getPontuacao());
        System.out.println(jogador2.isAtivado());
    }
}
