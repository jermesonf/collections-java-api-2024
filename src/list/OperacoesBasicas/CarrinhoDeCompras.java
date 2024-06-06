package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> tarefaItens;

    public CarrinhoDeCompras(){
        this.tarefaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

        //Adicionando item
        tarefaItens.add(new Item(nome.toLowerCase(),preco,quantidade));

    }

    public void removerItem(String nome){

        List<Item> itemParaRemover = new ArrayList<>();

        for(Item x : tarefaItens){
            if(x.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(x);
            }
        }

        tarefaItens.removeAll(itemParaRemover);
    }

    public int calcularValorTotal(){
        return tarefaItens.size();
    }

    public void exibirItens(){
        System.out.println(tarefaItens);
    }

    public static void main(String [] main){

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        //inicia com nenhum item
        System.out.println("Numero de elementos: " + carrinho.calcularValorTotal());

        //adicionando os itens
        carrinho.adicionarItem("Cafe", 17.50, 5);
        carrinho.adicionarItem("Cafe", 17.50, 5);
        carrinho.adicionarItem("Cuscuz", 7.30, 5);

        System.out.println("Numero de elementos: " + carrinho.calcularValorTotal());

        //deletando item
        carrinho.removerItem("cafe");
        System.out.println("Numero de elementos: " + carrinho.calcularValorTotal());

        //mostrando a lista com todos itens
        carrinho.exibirItens();
    }

}
