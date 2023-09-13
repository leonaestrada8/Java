package Coliseum.J4V4.BIBLIOTECA11;

public class Livro {
    private String titulo;
    private String autor;
    private Integer isbn;

    public Livro(String titulo, String autor, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Integer getIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return "Titulo " + titulo + ", Autor: " + autor + "ISBN: " + isbn;
    }

}
