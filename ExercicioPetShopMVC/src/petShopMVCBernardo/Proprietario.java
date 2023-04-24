package petShopMVCBernardo;

import java.util.ArrayList;



public class Proprietario {

	private String nome;
	private int id;
	private String cpf;
	private String endereco;
	
	private ArrayList<Proprietario> proprietarios = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Proprietario nome = " + nome + ", id = " + id + ", cpf = " + cpf + ", endereco = " + endereco;
	}



	public Proprietario(String nome, int id, String cpf, String endereco) {
		super();
		this.setNome(nome);
		this.setId(id);
		this.setCpf(cpf);
		this.setEndereco(endereco);
	}

	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	

    
    public void cadastrarProprietario(String nome, int id, String cpf, String endereco) {
        Proprietario proprietario = new Proprietario(nome, id, cpf, endereco);
        proprietarios.add(proprietario);
    }
    
    public ArrayList<Proprietario> getProprietarios() {
        return proprietarios;
    }

   


    public int acharProprietario() {
    	System.out.println("teste entrou na func");
    	return 1;
    	
    	
    }

	
}
