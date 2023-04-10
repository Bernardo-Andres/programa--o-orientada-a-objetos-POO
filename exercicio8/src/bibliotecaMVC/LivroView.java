package bibliotecaMVC;

// 

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LivroView extends JFrame{

	JTextField id, nome, autor, anoPublicacao;
	
	JLabel visor;
	
	JButton botao;
	
	
public LivroView() {
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	
    
    JLabel operador = new JLabel("Informe o id do Livro: ");
    add(operador);    
    id = new JTextField(8);
    add(id);
    
    operador = new JLabel("Informe o nome do Livro: ");
    add(operador);
    nome = new JTextField(8);
    add(nome);
    
    operador = new JLabel("Informe o autor do Livro: ");
    add(operador);
    autor = new JTextField(8);
    add(autor);
    
    operador = new JLabel("Informe o ano da publicação do Livro: ");
    add(operador);
    anoPublicacao = new JTextField(8);
    add(anoPublicacao);
    
    
    visor = new JLabel("  ");
    add(visor);
    
    botao = new JButton ("Adicionar livro");
    add(botao);
    
    pack();
    setVisible(true);
    
	}

	public String getid(){
		return id.getText();
      }

	public String getnome(){
		return nome.getText();
	  }
  
	public String getautor(){
	    return autor.getText();
	  }
  
	public String getanoPublicacao(){
	    return anoPublicacao.getText();
	  }
  
	
	public void setBotaoBehavior(ActionListener botaoBehavior){
	    botao.addActionListener(botaoBehavior);
	  }

	  public void setVisor(LivroModel result){
	    visor.setText("Nome do livro: " + result.getNome());
	  }
  
  




}
