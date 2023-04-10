package bibliotecaMVC;

//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivroControler {
	
	LivroModel livroModel;
	LivroView livroView;
	
	public LivroControler(LivroModel clivroModel, LivroView clivroView) {
		livroModel = clivroModel;
		livroView = clivroView;
		
		livroView.setBotaoBehavior(new BotaoBehavior());
		
	}
	
	class BotaoBehavior implements ActionListener{
		
		@Override
        public void actionPerformed(ActionEvent e) {
            String id = livroView.getid();
            String nome = livroView.getnome();
            String autor = livroView.getautor();
            String anoPublicacao = livroView.getanoPublicacao();
            
            Integer id1 = Integer.parseInt(id);
            
            livroModel.setLivroModel(id1, nome, autor, anoPublicacao);
            
           // livroModel.visualizarLivro(livroModel);
            
            
            
            livroView.setVisor(livroModel);
            
        }

    }
	
}
