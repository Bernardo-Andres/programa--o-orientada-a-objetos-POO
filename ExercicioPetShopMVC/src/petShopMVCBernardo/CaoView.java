package petShopMVCBernardo;



import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class CaoView extends JFrame {
    private JList<Cao> listaCao = new JList<>();
    JTextField campoNome = new JTextField();
    //private JTextField campoNome = new JTextField();
    private JTextField campoId = new JTextField();
    private JTextField campoCor = new JTextField();
    private JTextField campoSexo = new JTextField();
    private JTextField campoIdade = new JTextField();
    private JTextField campoRaca = new JTextField();
    private JTextField campoPeso = new JTextField();
    private JTextField campoPorte = new JTextField();
    private JTextField campoProprietario = new JTextField();
    private JButton botaoCadastrar = new JButton("Cadastrar");
    
    
    
    public CaoView() {
        super("Pet Shop - Cadastro de Cachorros");

        // Define o layout da janela principal
        setLayout(new BorderLayout());

        // Cria o painel de cadastro
        JPanel painelCadastro = new JPanel(new GridLayout(10, 2));
        painelCadastro.add(new JLabel("Nome:"));
        painelCadastro.add(campoNome);
        painelCadastro.add(new JLabel("ID:"));
        painelCadastro.add(campoId);
        painelCadastro.add(new JLabel("Cor:"));
        painelCadastro.add(campoCor);
        painelCadastro.add(new JLabel("Idade:"));
        painelCadastro.add(campoIdade);
        painelCadastro.add(new JLabel("Sexo:"));
        painelCadastro.add(campoSexo);
        painelCadastro.add(new JLabel("Peso:"));
        painelCadastro.add(campoPeso);
        painelCadastro.add(new JLabel("Porte:"));
        painelCadastro.add(campoPorte);
        painelCadastro.add(new JLabel("Raça:"));
        painelCadastro.add(campoRaca);
        painelCadastro.add(new JLabel());
        painelCadastro.add(new JLabel("ID Dono:"));
        painelCadastro.add(campoProprietario);
        
        painelCadastro.add(botaoCadastrar);

        // Cria o painel de listagem
        JPanel painelListagem = new JPanel(new BorderLayout());
        painelListagem.add(new JLabel("Cachorros Cadastrados"), BorderLayout.NORTH);
        painelListagem.add(new JScrollPane(listaCao), BorderLayout.CENTER);

        // Adiciona os painéis à janela principal
        add(painelCadastro, BorderLayout.NORTH);
        add(painelListagem, BorderLayout.CENTER);

        // Configura a janela principal
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    /*
    public Cao cadastrarCachorro() {
        String nome = campoNome.getText();
        int id = Integer.parseInt(campoId.getText());
        String cor = campoCor.getText();
        String sexo = campoSexo.getText();
        String peso = campoPeso.getText();
        String raca = campoRaca.getText();
        int idade = Integer.parseInt(campoIdade.getText());
        String porte = campoPorte.getText();
        return new Cao(id, nome, cor, idade, sexo, raca, porte, peso);
        //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
    }
    */
    public void mostrarCao(ArrayList<Cao> caes) {
        listaCao.setListData(caes.toArray(new Cao[0]));
    }

    public void addBotaoCadastrarListener(ActionListener listener) {
        botaoCadastrar.addActionListener(listener);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
	


public String getCampoNome() {
	return campoNome.getText();
}



public String getCampoId() {
	return campoId.getText();
}



public String getCampoCor() {
	return campoCor.getText();
}



public String getCampoSexo() {
	return campoNome.getText();
}




public String getCampoIdade() {
	return campoIdade.getText();
}



public String getCampoRaca() {
	return campoRaca.getText();
}



public String getCampoPeso() {
	return campoPeso.getText();
}



public String getCampoPorte() {
	return campoPorte.getText();
}



public String getCampoProprietario() {
	return campoProprietario.getText();
}

}




