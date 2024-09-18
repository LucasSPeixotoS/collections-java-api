package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefaPelaDescricao(String descricao){
        List<Tarefa> listaDeTarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa: listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                listaDeTarefasParaRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(listaDeTarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricao(){
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Tamanho da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Lucas");
        listaTarefas.adicionarTarefa("Eleonora");
        listaTarefas.adicionarTarefa("teste");
        listaTarefas.adicionarTarefa("lucas");
        listaTarefas.adicionarTarefa("LucAs");

        listaTarefas.obterDescricao();
        System.out.println("Tamanho da lista é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Apos remover\n");
        listaTarefas.removerTarefaPelaDescricao("lucas");
        System.out.println("Tamanho da lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricao();

    }
}
