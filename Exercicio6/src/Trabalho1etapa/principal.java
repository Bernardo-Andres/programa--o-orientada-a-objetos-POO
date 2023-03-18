package Trabalho1etapa;

import java.util.ArrayList;
import java.util.List;



public class principal {
	
	public static Double calculoPedido(List<String> itens, ArrayList<Pizza> listaPizza,ArrayList<Salgadinho> listaSalgadinho,ArrayList<Lanche> listaLanche) {
		
		Double valorTotal = 0.0;
		
		for(int i = 0; i<itens.size(); i++) {
			//System.out.println(itens.get(i));
		
		
		for(Pizza pz: listaPizza) {
			
            //System.out.println(pz.getNomePrato() + " ---------- Ingredientes: " + pz.getRecheio());
           if(itens.get(i) == pz.getNomePrato()) {
        	   System.out.println("os pratos possuem o msm nome" + itens.get(i) + "==" + pz.getNomePrato());
        	   valorTotal = valorTotal + pz.getPrecoDeVenda();
        	   }
        }
		
		

        for(Lanche lc: listaLanche) {
            //System.out.println(lc.getNomePrato() + " ---------- Ingredientes: " + lc.getRecheio());
            if(itens.get(i) == lc.getNomePrato()) {
            	System.out.println("os pratos possuem o msm nome" + itens.get(i) + "==" + lc.getNomePrato());
            	valorTotal = valorTotal + lc.getPrecoDeVenda();
            }
        }
        
        

        for(Salgadinho sg: listaSalgadinho) {
            //System.out.println(sg.getNomePrato() + " ---------- Ingredientes: " + sg.getRecheio());
            if(itens.get(i) == sg.getNomePrato()) {
            	System.out.println("os pratos possuem o msm nome" + itens.get(i) + "==" + sg.getNomePrato());
            	valorTotal = valorTotal + sg.getPrecoDeVenda();
            }
        }
        
        
		
		}
		
		return valorTotal;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();
		
		ArrayList<Salgadinho> listaSalgadinho = new ArrayList<Salgadinho>();
		
		ArrayList<Lanche> listaLanche = new ArrayList<Lanche>();
		
		Double valorTotal;
		
		
		
		Pizza pizza = new Pizza ("Frango com catupiry", 54.00, 1.55, "3 Dias", "Frango, catupiry, queijo, oregano", "molho de tomate", "com borda de chedar");
		listaPizza.add(pizza);		
		
		pizza = new Pizza ("Marguerita", 33.00, 1.00, "3 Dias", "Queijo, oregano, tomate, presunto", "molho de tomate", "com borda de catupiry");
		listaPizza.add(pizza);
		
		Salgadinho salgadinho = new Salgadinho("Coxinha", 3.00, 0.3, "2 Dias", "Frito", "padrao", "Pizza");
		listaSalgadinho.add(salgadinho);
		
		salgadinho = new Salgadinho("Empada", 3.00, 0.25, "2 Dias", "Assado", "Massa podre", "milho");
		listaSalgadinho.add(salgadinho);
		
		Lanche lanche = new Lanche("Pao com linguiça",10.00, 0.50, "1 Dia","frances", "presunto, queijo, linguiça", "maionese da casa");
		listaLanche.add(lanche);
		
		lanche = new Lanche("Hamburger assado",4.50, 0.50,"2 Dias","pao de batata", "hamburger, catupiry, tomate, queijo", "maionese da casa");
		listaLanche.add(lanche);
				
		System.out.println("********* CARDAPIO *********");
		
		System.out.println();
		
		System.out.println("          -Pizzas-       ");
		
		System.out.println();
		
		for(Pizza pz: listaPizza) {
			
            System.out.println(pz.getNomePrato() + " ---------- Ingredientes: " + pz.getRecheio());
            System.out.println("Preço: "+ pz.getPrecoDeVenda());
            System.out.println();
        }
		
		System.out.println("          -Lanches-       ");
		
		System.out.println();

        for(Lanche lc: listaLanche) {
            System.out.println(lc.getNomePrato() + " ---------- Ingredientes: " + lc.getRecheio());
            System.out.println("Preço: " + lc.getPrecoDeVenda());
            System.out.println();
        }
        
        System.out.println("         -Salgadinhos-       ");
		
		System.out.println();

        for(Salgadinho sg: listaSalgadinho) {
            System.out.println(sg.getNomePrato() + " ---------- Ingredientes: " + sg.getRecheio());
            System.out.println("Preço: " + sg.getPrecoDeVenda());
            System.out.println();
        }
        
        List<String> testelista = List.of("Pao com linguiça", "Hamburger assado", "Frango com catupiry", "Empada");
		
        calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche);
        
        
        
        Double resultado = calculoPedido(testelista, listaPizza, listaSalgadinho, listaLanche);
        System.out.println(resultado);
		
	}
}
