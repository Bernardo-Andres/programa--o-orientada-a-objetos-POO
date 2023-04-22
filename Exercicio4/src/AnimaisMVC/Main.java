package AnimaisMVC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetShopView petShopView = new PetShopView();
        PetShopController petShopController = new PetShopController();

        int opcao = 0;
        while (opcao != 6) {
            petShopView.mostrarMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    petShopView.cadastrarProprietario(scanner);
                    break;
                case 2:
                    petShopView.cadastrarCao(scanner);
                    break;
                case 3:
                    petShopView.cadastrarGato(scanner);
                    break;
                case 4:
                    petShopView.cadastrarPassaro(scanner);
                    break;
                case 5:
                    petShopView.imprimirAnimaisDoProprietario(scanner);
                    break;
                case 6:
                    petShopView.imprimirAnimaisComProprietario();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}