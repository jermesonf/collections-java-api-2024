package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //Atributos
    private List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){

        //Metodo de adicionar tarefas
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        //Metodo de remover tarefa
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String [] main){

        //Intanciando
        ListaTarefa listaTarefa = new ListaTarefa();

        //imprimindo elementos da lista porém sera = 0 pois ainda não foi adicionado elementos
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //adicionando elementos dentro da lista de tarefa, pode comentar as linhas abaixo para realizar testes
        listaTarefa.adicionarTarefa("Tarefa 1");
        //observe que foi repetido tarefa com o mesmo nome
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        //imprimindo elementos da lista de tarefas
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //removendo uma tarefa, pode comentar a linha abaixo para realizar testes
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
