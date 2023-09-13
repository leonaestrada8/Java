package Coliseum.J4V4.BIBLIOTECA11;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Integer isbn) {
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }

}
