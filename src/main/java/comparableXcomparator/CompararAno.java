package main.java.comparableXcomparator;

import java.util.Comparator;

// Classe para comparar Livro por ano
public class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        return Integer.compare(livro1.getAno(), livro2.getAno());
		/*
		if (livro1.getAno() < livro2.getAno())
			return -1;
		if (livro1.getAno() > livro2.getAno())
			return 1;
		else
			return 0;
		 */
    }
}
