package veiculos;
import java.util.Scanner;

public class Carro extends Veiculos {
	
			private int roda = 0;
			private int porta = 0;
			private int cqtd;
			
	Scanner carro = new Scanner(System.in);
		
		public int getRoda() {
			return roda;
		}
		public void setRoda(int roda) {
			this.roda = roda;
		}
		public int getPorta() {
			return porta;
		}
		public void setPorta(int porta) {
			this.porta = porta;
		}
		public int getCqtd() {
			return cqtd;
		}
		public void setCqtd(int cqtd) {
			this.cqtd = cqtd;
		}
		
		public void inclusaoCarro() {
			System.out.println("\n--------------------- CADASTRO ---------------------");
			System.out.println("Digite as informações sobre o Carro a ser cadastrado");
			inclusaoVeiculos();
			System.out.println("Informe a quantidade de rodas:");
			setRoda(carro.nextInt());
			System.out.println("Informe a quantidade de portas:");
			setPorta(carro.nextInt());
			System.out.println("-----------------------------------------------------");
		}
		
		public void impressaoCarro() {
			System.out.println("\n--------------------- VISUZALIZAÇÃO ---------------------");
			impressaoVeiculos();
			System.out.println("A quantidade de rodas do Carro informado é: " + getRoda());
			System.out.println("A quantidade de portas do Carro informado é: " + getPorta());
			System.out.println("----------------------------------------------------------");
		}
}