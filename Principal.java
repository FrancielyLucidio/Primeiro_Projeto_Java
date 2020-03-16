package veiculos;
import java.util.Scanner;
import java.util.ArrayList;

// FRANCIELY LUCIDIO DA SILVA - CI�NCIA DA COMPUTA��O - 6� TERMO 

public class Principal {
	private static Scanner ler;

	public static void main(String [] args) {
	
			int opcao, i = 0;
	
	ler = new Scanner(System.in);
		
			ArrayList<Barco> barcos = new ArrayList<Barco>();
			ArrayList<Carro> carros = new ArrayList<Carro>();
			ArrayList<Moto> motos = new ArrayList<Moto>();
						
	do {
		System.out.println("\n--------------- MENU ---------------");
		System.out.println("Informe o n�mero da op��o desejada");
		System.out.println("1. Cadastro de Registros");
		System.out.println("2. Visualiza��o de Registros");
		System.out.println("3. Exclus�o de Registros");
		System.out.println("4. Finaliza��o do Sistema");
		System.out.println("------------------------------------");
		opcao= ler.nextInt();
			switch(opcao) {
			case 1: 
				System.out.println("\n------------------------ OP��ES ------------------------");
				System.out.println("Informe o n�mero da op��o do registro que deseja cadastrar:");
				System.out.println("1. Barco");
				System.out.println("2. Carro");
				System.out.println("3. Moto");
				System.out.println("-------------------------------------------------------");
				opcao= ler.nextInt();
					switch(opcao) {
					case 1:
						Barco barco = new Barco();
						barco.inclusaoBarco();
						barcos.add(barco);
					break;
					case 2:
						Carro carro = new Carro();
						carro.inclusaoCarro();
						carros.add(carro);
					break;
					case 3:
						Moto moto = new Moto();
						moto.inclusaoMoto();
						motos.add(moto);
					break;
					default:
						System.out.println("------------- OP��O INV�LIDA -------------");
					break;
					}
			break;
			case 2:
				System.out.println("\n-------------------------- OP��ES --------------------------");
				System.out.println("Informe o n�mero da op��o do registro que deseja visualizar:");
				System.out.println("1. Barco");
				System.out.println("2. Carro");
				System.out.println("3. Moto");
				System.out.println("-------------------------------------------------------------");
				opcao= ler.nextInt();
					switch(opcao) {
					case 1:
						for (i = 0; i < barcos.size(); i++) {
							barcos.get(i).impressaoBarco();
						}
					break;
					case 2:
							for(i = 0; i < carros.size(); i++) {
							carros.get(i).impressaoCarro();
							}
					break;
					case 3:
							for(i = 0; i < motos.size(); i++) {
							motos.get(i).impressaoMoto();
							}
					break;
					default:
						System.out.println("------------- OP��O INV�LIDA -------------");
					break;
					}
			break;
			case 3: 
				System.out.println("\n-------------------------- OP��ES --------------------------");
				System.out.println("Informe o n�mero da op��o dos registros que deseja resetar:");
				System.out.println("1. Barco");
				System.out.println("2. Carro");
				System.out.println("3. Moto");
				System.out.println("-------------------------------------------------------------");
				opcao= ler.nextInt();
					switch(opcao) {
					case 1:
						barcos.clear();
						System.out.println("\n--------------- AVISO ---------------");
						System.out.println("O Cadastro de Barcos foi resetado!");
						System.out.println("---------------------------------------");
					break;
					case 2:
						carros.clear();
						System.out.println("\n--------------- AVISO ---------------");
						System.out.println("O Cadastro de Carro foi resetado!");
						System.out.println("---------------------------------------");
					break;
					case 3:
						motos.clear();
						System.out.println("\n--------------- AVISO ---------------");
						System.out.println("O Cadastro de Motos foi resetado!");
						System.out.println("---------------------------------------");
					break;
					default:
						System.out.println("------------- OP��O INV�LIDA -------------");
					break;
					}
			break;
			case 4:
				System.out.println("------------- SISTEMA FINALIZADO -------------");
				System.exit(0);
			default:	
				System.out.println("------------- OP��O INV�LIDA -------------");
			break;
			}
			
		} while (opcao != 4);  
	}
}