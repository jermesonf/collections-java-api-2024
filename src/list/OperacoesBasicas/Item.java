package list.OperacoesBasicas;

public class Item {

    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String name, double price, int quantity){
        nome = name;
        preco = price;
        quantidade = quantity;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}
