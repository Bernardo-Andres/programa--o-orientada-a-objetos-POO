package AnimaisMVC;

import java.util.List;
import java.util.Scanner;

public class PetShopView {
    private static final String TipoAnimal = null;
	private PetShopController controller;
    private Scanner scanner;

    public PetShopView(PetShopController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("--- PET SHOP ---");
        System.out.println("1 - Cadastrar proprietário");
        System.out.println("2 - Cadastrar animal");
        System.out.println("3 - Buscar animais de um proprietário");
        System.out.println("4 - Listar todos os animais");
        System.out.println("5 - Listar todos os proprietários");
        System.out.println("6 - Ordenar animais por idade");
        System.out.println("0 - Sair");
    }

    public void cadastrarProprietario() {
        System.out.println("--- CADASTRAR PROPRIETÁRIO ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        Proprietario proprietario = new Proprietario(nome, cpf, telefone);
        controller.cadastrarProprietario(proprietario);
        System.out.println("Proprietário cadastrado com sucesso!");
        System.out.println();
    }

    public void cadastrarAnimal() {
        System.out.println("--- CADASTRAR ANIMAL ---");
        System.out.print("CPF do proprietário: ");
        String cpf = scanner.nextLine();
        Proprietario proprietario = buscarProprietario(cpf);
        if (proprietario == null) {
            System.out.println("Proprietário não encontrado!");
            System.out.println();
            return;
        }
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.nextLine().charAt(0);
        Animal animal;
        if (proprietario.getAnimais() == TipoAnimal.Cao) {
            System.out.print("Porte: ");
            String porte = scanner.nextLine();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            animal = new Cao(nome, idade, raca, cor, sexo, porte, peso);
        } else if (proprietario.getTipoAnimal() == TipoAnimal.Gato) {
            System.out.print("Porte: ");
            String porte = scanner.nextLine();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            animal = new Gato(nome, idade, raca, cor, sexo, porte, peso);
        } else {
            System.out.print("Número da anilha: ");
            int numeroAnilha = scanner.nextInt();
            scanner.nextLine();
            animal = new Passaro(nome, idade, raca, cor, sexo, numeroAnilha);
        }
        controller.cadastrarAnimal(proprietario, animal);
        System.out.println("Animal cadastrado com sucesso!");
        System.out.println();
    }
    
    public void buscarAnimaisPorProprietario() {
        System.out.println("--- BUSCAR ANIMAIS DE UM PROPRIETÁRIO ---");
        System.out.print("CPF do proprietário: ");
        String cpf = scanner.nextLine();
        Proprietario proprietario = buscarProprietario(cpf);
        if (proprietario == null) {
            System.out.println("Proprietário não encontrado!");
            System.out.println();
            return;
        }
        System.out.println("Animais do proprietário " + proprietario.getNome() + ":");
        List<Animal> animais = controller.buscarAnimaisPorProprietario(proprietario);
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado para este proprietário.");
        } else {
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
        System.out.println();
    }

    public void listarAnimais() {
        System.out.println("--- LISTAR ANIMAIS ---");
        List<Animal> animais = controller.listarAnimais();
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : animais) {
                System.out.println(animal + " - Proprietário: " + animal.getProprietario().getNome());
            }
        }
        System.out.println();
    }

    public void listarProprietarios() {
        System.out.println("--- LISTAR PROPRIETÁRIOS ---");
        List<Proprietario> proprietarios = controller.buscarTodosProprietarios();
        if (proprietarios.isEmpty()) {
            System.out.println("Nenhum proprietário cadastrado.");
        } else {
            for (Proprietario proprietario : proprietarios) {
                System.out.println(proprietario);
            }
        }
        System.out.println();
    }

    public void ordenarAnimaisPorIdade() {
        System.out.println("--- ORDENAR ANIMAIS POR IDADE ---");
        Object i;
		List<Animal> animais = controller.ordenarAnimaisPorIdade();
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : animais) {
                System.out.println(animal + " - Proprietário: " + animal.getProprietario().getNome());
            }
        }
        System.out.println();
    }

    private Proprietario buscarProprietario(String cpf) {
        Proprietario proprietario = controller.buscarProprietario(cpf);
        return proprietario;
    }
}
