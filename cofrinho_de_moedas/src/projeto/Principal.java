package projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		boolean encerrar = false;
		
		Scanner entrada = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("~~ Seja Bem Vindo ao Seu Cofre de Moedas! ~~");
		System.out.println();
		
		while(!encerrar) {
			menuPrincipal();
			opcao = entrada.nextInt();
			if (opcao == 1) {
				// Adicionar moedas
				menuAdicionar();
				switch (entrada.nextInt()) {
				case 1:
					menuValor();
					Real real = new Real(entrada.nextDouble());
					cofrinho.adicionar(real);
					break;
				case 2:
					menuValor();
					Dolar dolar = new Dolar(entrada.nextDouble());
					cofrinho.adicionar(dolar);
					break;
				case 3:
					menuValor();
					Euro euro = new Euro(entrada.nextDouble());
					cofrinho.adicionar(euro);
					break;
				}
			} else if (opcao == 2 ) {
				// Remover moedas
				menuRemover();
				switch (entrada.nextInt()) {
				case 1:
					menuValor();
					Real real = new Real(entrada.nextDouble());
					cofrinho.remover(real);
					break;
				case 2:
					menuValor();
					Dolar dolar = new Dolar(entrada.nextDouble());
					cofrinho.remover(dolar);
					break;
				case 3:
					menuValor();
					Euro euro = new Euro(entrada.nextDouble());
					cofrinho.remover(euro);
					break;
				}
			}  else if (opcao == 3) {
				// Listas as moedas que o usuário possui
				System.out.println("--------------------------------------------");
				System.out.println("Estas são suas moedas: ");
				cofrinho.listagemMoedas();
			} else if (opcao == 4) {
				// Exibe o valor total das moedas convertido para reais
				System.out.println("--------------------------------------------");
				cofrinho.totalConvertido();
			} else if (opcao == 0) {
				//Encerra o programa
				System.out.println("--------------------------------------------");
				System.out.println("Obrigado por utilizar seu Cofrinho de Moedas!");
				System.out.println("Encerrando programa...");
				entrada.close();
				encerrar = true;
			}
		}
	}
	
	private static void menuPrincipal() {	
		//Função que exibe o menu principal
		System.out.println("--------------------------------------------");
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Valor total de moedas em Reais");
		System.out.println("0 - Encerrar Programa");
	}
		
	private static void menuAdicionar() {
		//Função que exibe o menu para adicionar moedas
		System.out.println("--------------------------------------------");
		System.out.println("Escolha a moeda que deseja ADICIONAR: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");	
	}
	
	private static void menuRemover() {
		//Função que exibe o menu para remover moedas
		System.out.println("--------------------------------------------");
		System.out.println("Escolha a moeda que deseja REMOVER: ");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");	
	}
	
	private static void menuValor() {
		// Exibe o menu que solicita o valor ao usuário
		System.out.println("--------------------------------------------");
		System.out.println("Digite o valor: ");
	}
	
}
