package petShopMVCBernardo;



public class Principal {
    public static void main(String[] args) {
        Proprietario model = new Proprietario(null, 0, null, null);
        ProprietarioView view = new ProprietarioView();
        ProprietarioController controller = new ProprietarioController(model, view);
        
        
        
        Cao model2 = new Cao(0, null, null, 0, null, null, null, null);
        CaoView view2 = new CaoView();
        CaoController controller2 = new CaoController(model2, view2);
        
        
        
        
        Gato model1 = new Gato(0, null, null, 0, null, null, null, null);
        GatoView view1 = new GatoView();
        GatoController controller1 = new GatoController(model1, view1);
        
        
        
        
        Passaro model3 = new Passaro(0, null, null, 0, null, null, null);
        PassaroView view3 = new PassaroView();
        PassaroController controller3 = new PassaroController(model3, view3);
    }
}



