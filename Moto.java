package veiculos;
import java.util.Scanner;

public class Moto extends Veiculos {
	
			private int roda = 0;
			private int mqtd;
	
	Scanner moto = new Scanner(System.in);
			
		public int getRoda() {
			return roda;
		}
		public void setRoda(int roda) {
			this.roda = roda;
		}
		public int getMqtd() {
			return mqtd;
		}
		public void setMqtd(int mqtd) {
			this.mqtd = mqtd;
		}
		
		public void inclusaoMoto() {
			System.out.println("\n--------------------- CADASTRO ---------------------");
			System.out.println("Digite as informa��es sobre a Moto a ser cadastrada");
			inclusaoVeiculos();
			System.out.println("Informe a quantidade de rodas:");
			setRoda(moto.nextInt());
			System.out.println("-----------------------------------------------------");
		}
		
		public void impressaoMoto() {
			System.out.println("\n--------------------- VISUZALIZA��O ---------------------");
			impressaoVeiculos();
			System.out.println("A quantidade de rodas do Ve�culo informada �: " + getRoda());
			System.out.println("----------------------------------------------------------");
		}
}