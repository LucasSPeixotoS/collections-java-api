package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("nome3", 25, 1.62);
        ordenacaoPessoa.adicionarPessoa("nome4", 17, 1.56);

        System.out.println(ordenacaoPessoa.listaPessoas);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }

}
