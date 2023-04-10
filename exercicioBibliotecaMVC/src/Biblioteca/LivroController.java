package osvano;

import java.util.ArrayList;
import java.util.List;

public class LivroController {
    private List<Livro> livros;
    private List<Categoria> categorias;

    public LivroController(Livro livro, LivroView livroView) {
        livros = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void cadastrarLivro(String nome, Categoria categoria) {
        Livro livro = new Livro(nome, categoria);
        livros.add(livro);
    }

    public void cadastrarCategoria(String nome) {
        Categoria categoria = new Categoria(nome);
        categorias.add(categoria);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
