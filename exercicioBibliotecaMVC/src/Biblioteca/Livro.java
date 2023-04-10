package bibliotecaMVC;

public class Livro {
    private String nome;
    private Categoria categoria;

    public Livro(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}

