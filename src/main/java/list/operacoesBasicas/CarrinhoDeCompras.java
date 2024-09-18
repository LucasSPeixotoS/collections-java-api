package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaDeItensParaRemover = new ArrayList<>();
        for (Item item: listaDeItens) {
            if (item.getNome().equalsIgnoreCase(nome)){
                listaDeItensParaRemover.add(item);
            }
        }
        listaDeItens.removeAll(listaDeItensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : listaDeItens) {
            valorTotal = valorTotal + (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaDeItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Bola", 12.50, 5);
        carrinhoDeCompras.adicionarItem("Pião", 8.20, 3);
        carrinhoDeCompras.adicionarItem("Pinça", 5.40, 10);
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total é de " + carrinhoDeCompras.calcularValorTotal() + "\n");
        System.out.println("removendo um item Pinça");

        carrinhoDeCompras.removerItem("pinça");

        System.out.println("O valor total é de " + carrinhoDeCompras.calcularValorTotal() + "\n");

        carrinhoDeCompras.exibirItens();

    }
}
