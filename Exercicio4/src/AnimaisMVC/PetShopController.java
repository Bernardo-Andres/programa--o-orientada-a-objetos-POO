package AnimaisMVC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetShopController {
    private Map<Proprietario, List<Animal>> animaisPorProprietario;

    public PetShopController() {
        this.animaisPorProprietario = new HashMap<>();
    }

    public void cadastrarProprietario(Proprietario proprietario) {
        animaisPorProprietario.put(proprietario, new ArrayList<>());
    }

    public void cadastrarAnimal(Proprietario proprietario, Animal animal) {
        List<Animal> animais = animaisPorProprietario.get(proprietario);
        animais.add(animal);
    }

    public List<Animal> buscarAnimaisPorProprietario(Proprietario proprietario) {
        return animaisPorProprietario.get(proprietario);
    }

    public List<Animal> buscarTodosAnimais() {
        List<Animal> todosAnimais = new ArrayList<>();
        for (List<Animal> animais : animaisPorProprietario.values()) {
            todosAnimais.addAll(animais);
        }
        return todosAnimais;
    }

    public List<Proprietario> buscarTodosProprietarios() {
        return new ArrayList<>(animaisPorProprietario.keySet());
    }

    public List<Animal> ordenarAnimaisPorIdade() {
        for (List<Animal> animais : animaisPorProprietario.values()) {
            Collections.sort(animais, Comparator.comparing(Animal::getIdade));
        }
		return null;
    }

	public List<Animal> listarAnimais() {
		// TODO Auto-generated method stub
		return null;
	}

	public Proprietario buscarProprietario(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
}