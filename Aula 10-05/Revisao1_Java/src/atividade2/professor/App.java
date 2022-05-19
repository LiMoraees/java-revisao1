package atividade2.professor;

public class App {
    public static void main(String[] args) {
        
        //Criar objeto de produto
        Produto prod1 = new Produto(111, 1200.00, "Pc da Positivo");
        Produto prod2 = new Produto(125, 600.00, "Carregador Iphone");

        //Criar um objeto ItemPedido
        ItemPedido itemProd1 = new ItemPedido(5, prod1);
        ItemPedido itemProd2 = new ItemPedido(2, prod2);


        //Imprimir dados do Produto que está em ItemPedido
        System.out.println("Descrição: " + itemProd1.getProduto().getDescricao());
        System.out.println("Descrição: " + itemProd2.getProduto().getDescricao());

        System.out.println("Valor total: " + (itemProd1.getProduto().getValor() * itemProd1.getQuantidade()));
        System.out.println("Valor total: " + (itemProd2.getProduto().getValor() * itemProd1.getQuantidade()));

        //Criar um objeto do tipo pedido
        Pedido pedido = new Pedido();

        //Adicionar um ItemPedido ao Pedido
        pedido.adicionarItem(itemProd1);
        pedido.adicionarItem(itemProd2);

        //Imprimir o valor total
        System.out.println("Valor total: " + pedido.obterTotal()); 
    }
}
