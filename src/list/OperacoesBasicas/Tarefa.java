package list.OperacoesBasicas;

public class Tarefa {

    //Atributos
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }


    //para ser criado usei (alt + insert) ou botão direito generate toString()
    @Override
    public String toString() {
        return descricao;
    }
}
