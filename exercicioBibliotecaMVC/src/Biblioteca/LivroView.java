package osvano;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class LivroView extends JFrame {
    private JTextField txtNomeLivro;
    private JComboBox<Categoria> cmbCategorias;
    private JButton btnCadastrarLivro;
    private JButton btnCadastrarCategoria;
    private JTextArea txtLivros;

    private LivroController controller;
    
    

    public LivroView() {
        controller = new LivroController(null, null);

        // Cadastra as categorias
        controller.cadastrarCategoria("Ficção");
        controller.cadastrarCategoria("Romance");
        controller.cadastrarCategoria("Terror");
        controller.cadastrarCategoria("Suspense");

        // Cadastra os livros
        controller.cadastrarLivro("O Hobbit", controller.getCategorias().get(0));
        controller.cadastrarLivro("A Cabana", controller.getCategorias().get(1));
        controller.cadastrarLivro("It - A Coisa", controller.getCategorias().get(2));
        controller.cadastrarLivro("O Código Da Vinci", controller.getCategorias().get(3));
        controller.cadastrarLivro("A Menina Que Roubava Livros", controller.getCategorias().get(1));
        controller.cadastrarLivro("Harry Potter e a Pedra Filosofal", controller.getCategorias().get(0));
        controller.cadastrarLivro("O Senhor dos Anéis - A Sociedade do Anel", controller.getCategorias().get(0));
        controller.cadastrarLivro("Cem Anos de Solidão", controller.getCategorias().get(1));
        controller.cadastrarLivro("O Iluminado", controller.getCategorias().get(2));
        controller.cadastrarLivro("Anjos e Demônios", controller.getCategorias().get(3));

        setTitle("Cadastro de Livros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JPanel panelCampos = new JPanel(new GridLayout(2, 2));
        panel.add(panelCampos, BorderLayout.NORTH);

        panelCampos.add(new JLabel("Nome do Livro:"));
        txtNomeLivro = new JTextField();
        panelCampos.add(txtNomeLivro);

        panelCampos.add(new JLabel("Categoria:"));
        cmbCategorias = new JComboBox<>(controller.getCategorias().toArray(new Categoria[0]));
        panelCampos.add(cmbCategorias);
        //toArray(new Categoria[0])

        btnCadastrarLivro = new JButton("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(e -> cadastrarLivro());
        panel.add(btnCadastrarLivro, BorderLayout.WEST);

        btnCadastrarCategoria = new JButton("Cadastrar Categoria");
        btnCadastrarCategoria.addActionListener(e -> cadastrarCategoria());
        panel.add(btnCadastrarCategoria, BorderLayout.EAST);

        txtLivros = new JTextArea(10, 30);
        panel.add(new JScrollPane(txtLivros), BorderLayout.SOUTH);

        pack();
        setVisible(true);

        carregarLivros();
    }

    private void cadastrarLivro() {
        String nome = txtNomeLivro.getText();
        Categoria categoria = (Categoria) cmbCategorias.getSelectedItem();

        if (!nome.isEmpty()) {
            controller.cadastrarLivro(nome, categoria);
            carregarLivros();
            txtNomeLivro.setText("");
        }
    }

    private void cadastrarCategoria() {
        String nome = JOptionPane.showInputDialog("Digite o nome da categoria:");

        if (!nome.isEmpty()) {
            controller.cadastrarCategoria(nome);
            carregarCategorias();
        }
    }



    private void carregarLivros() {
    List<Livro> livros = controller.getLivros();
    StringBuilder strLivros = new StringBuilder();
    for (Livro livro : livros) {
        strLivros.append(livro.getNome());
        strLivros.append(" - ");
        strLivros.append(livro.getCategoria().getNome());
        strLivros.append("\n");
    }
    txtLivros.setText(strLivros.toString());
}



    private void carregarCategorias() {
    List<Categoria> categorias = controller.getCategorias();
    for (Categoria categoria : categorias) {
    	//String teste = categoria.getNome();
        cmbCategorias.addItem(categoria);
    	System.out.println(categoria.getNome());
    	
    }
}

}
