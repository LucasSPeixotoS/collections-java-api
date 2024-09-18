package comparableXcomparator;

import java.util.Comparator;

// Classe para comparar Livro por autor
public class CompararAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        return livro1.getAutor().compareTo(livro2.getAutor());
    }
}
