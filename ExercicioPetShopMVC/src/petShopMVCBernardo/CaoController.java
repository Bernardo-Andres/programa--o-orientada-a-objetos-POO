package petShopMVCBernardo;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CaoController {
    private Cao model;
    private CaoView view;

    public CaoController(Cao model, CaoView view) {
        this.model = model;
        this.view = view;

        view.addBotaoCadastrarListener(new BotaoCadastrarListener());
    }

    class BotaoCadastrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Cao cao = view.cadastrarCachorro();
                model.cadastrarCao(cao.getId(), cao.getNome(), cao.getCor(), cao.getIdade(), cao.getSexo(), cao.getPorte(), cao.getRaca(), cao.getPorte(), cao.getPeso());
                //int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso
                view.mostrarMensagem("Cao cadastrado com sucesso!");
                view.mostrarCao(model.getCao());
            } catch (NumberFormatException ex) {
                view.mostrarMensagem("Por favor, preencha todos os campos corretamente.");
            }
        }
    }
}