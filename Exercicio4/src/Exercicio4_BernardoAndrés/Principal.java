package Exercicio4_BernardoAndrés;

import java.util.ArrayList;
import java.util.Collections;



public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		ArrayList<PertenceAoDono> listaPertenceAoDono = new ArrayList<PertenceAoDono>();
		
		ArrayList<CaoGato> listaCaoGato = new ArrayList<CaoGato>();
		
		ArrayList<Passaro> listaPassaro = new ArrayList<Passaro>();
		
		ArrayList<Animais> listaAnimais = new ArrayList<Animais>();
		
		
		
		Pessoa pessoa = new Pessoa("Bernardo Andrés", "Rua josé Augusto da Fonseca", 01, "10583710611");
		listaPessoa.add(pessoa);
		
		pessoa = new Pessoa("Hanna Barbaosa","Rua 15 de novembro", 02,"83710610511");
		listaPessoa.add(pessoa);
		
		pessoa = new Pessoa("Mauro Barroso","av. Olegario Maciel", 03,"75315985244");
		listaPessoa.add(pessoa);
		
		pessoa = new Pessoa("Adriano Ferreira","Rua 7 de setembro", 04,"45695175346");
		listaPessoa.add(pessoa);		
		
		
		
		CaoGato caogato = new CaoGato("Petra", 11, "Mel", "American Starforshired Bull Terrier", "F", "Médio", 30.0, 10);		
		listaCaoGato.add(caogato);
		
		Animais animais = new Animais("Petra", 11, "Mel", "American Starforshired Bull Terrier", "F", 10);
		listaAnimais.add(animais);
		
		caogato = new CaoGato("Nagan", 12, "Branco", "Labrador", "M", "Grande", 42.0, 11);
		listaCaoGato.add(caogato);
		
		animais = new Animais("Nagan", 12, "Branco", "Labrador", "M", 11);
		listaAnimais.add(animais);
		
		caogato = new CaoGato("Bruma", 8, "Preto", "Doberman", "F", "Grande", 45.0, 12);
		listaCaoGato.add(caogato);
		
		animais = new Animais("Bruma", 8, "Preto", "Doberman", "F", 12);
		listaAnimais.add(animais);
		
		caogato = new CaoGato("Bolinha", 5, "Rajada", "Fila", "F", "Grande", 50.0, 13);
		listaCaoGato.add(caogato);
		
		animais = new Animais("Bolinha", 5, "Rajada", "Fila", "F", 13);
		listaAnimais.add(animais);
		
		
		Passaro passaro = new Passaro("Lua", 2, "Branco", "Canario", "F", 1111, 20);
		listaPassaro.add(passaro);
		
		animais = new Animais("Lua", 2, "Branco", "Canario", "F", 20);
		listaAnimais.add(animais);
		
		passaro = new Passaro("Sol", 2, "Amarelo", "Canario", "M", 2222, 21);
		listaPassaro.add(passaro);
		
		animais = new Animais("Sol", 2, "Amarelo", "Canario", "M", 21);
		listaAnimais.add(animais);
		
		
		
		PertenceAoDono pertence = new PertenceAoDono(01,10);
		listaPertenceAoDono.add(pertence);
		
		pertence = new PertenceAoDono(01,20);
		listaPertenceAoDono.add(pertence);
		
		pertence = new PertenceAoDono(01,21);
		listaPertenceAoDono.add(pertence);
		
		pertence = new PertenceAoDono(02,11);
		listaPertenceAoDono.add(pertence);
		
		pertence = new PertenceAoDono(03,12);
		listaPertenceAoDono.add(pertence);
		
		pertence = new PertenceAoDono(04,13);
		listaPertenceAoDono.add(pertence);
		
		
		
		Collections.sort(listaAnimais);
		for(int k=0; k < listaAnimais.size(); k++) {
			//System.out.println("Idade: " + listaAnimais.get(k).getIdade());
		}
		
		
		for(Animais animaisFor : listaAnimais) {
			System.out.println(animaisFor.getNome());
			//System.out.println(animaisFor.getIdade());
			
			for (PertenceAoDono pertenceA: listaPertenceAoDono) {
				if(pertenceA.getIdA() == animaisFor.getIdA()) {
					System.out.println("Encontrou");
					//System.out.println("O animal possui o id: " + animaisFor.getIdA() + " e o dono tem o id: " + pertenceA.getIdA() +"  "+ pertenceA.getId());
					
					for(Pessoa dono : listaPessoa) {
						if(dono.getId() == pertence.getId() ) {
							System.out.println("id pessoa: " + dono.getId() + " id pessoa: " + pertence.getId()+" id animal: " + pertence.getIdA());
						}
					}
				}
				
			}
		}
		
		
		
		
		
		
		
		
		//for(int i=0; i < listaPessoa.size(); i++) {
			//System.out.println("nome:" + listaPessoa.get(i).getNome());
		//}
		
		
		
	}

}
