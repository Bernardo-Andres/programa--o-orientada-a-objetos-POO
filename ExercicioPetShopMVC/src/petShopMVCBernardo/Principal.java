package petShopMVCBernardo;



public class Principal {
    public static void main(String[] args) {
        Proprietario model = new Proprietario(null, 0, null, null);
        ProprietarioView view = new ProprietarioView();
        ProprietarioController controller = new ProprietarioController(model, view);
    }
}



