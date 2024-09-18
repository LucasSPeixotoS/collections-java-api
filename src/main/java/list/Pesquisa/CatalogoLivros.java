package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> listaDeLivrosPorIntervaloDeAno = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    listaDeLivrosPorIntervaloDeAno.add(livro);
                }
            }
        }

        return listaDeLivrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!listaLivros.isEmpty()) {
            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                    return listaLivros.get(i);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1997);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAno(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro1"));

    }
}
