package AnimaisMVC;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Animal> animais;

    public Proprietario(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.animais = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animais.add(animal);
    }

    public List<Animal> getAnimais() {
        return animais;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Object getTipoAnimal() {
		// TODO Auto-generated method stub
		return null;
	}
    
}