package projeto;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for(Moeda moeda2 : this.listaMoedas) {
			System.out.println(moeda2.info());
		}
	}
	
	public void totalConvertido() {
		double total = 0.0;
		for(Moeda moeda3 : this.listaMoedas) {
			total = total + moeda3.converter();
		}
		System.out.printf("Valor total em Reais: %.2f\n", total);
	}
}
