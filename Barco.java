package veiculos;
import java.util.Scanner;

public class Barco extends Veiculos {
	
			private int pes = 0;
			private int bqtd;
			
	Scanner barco = new Scanner(System.in);
	
		public int getPes() {
			return pes;
		}
		public void setPes(int pes) {
			this.pes = pes;
		}		
		public int getBqtd() {
			return bqtd;
		}
		public void setBqtd(int bqtd) {
			this.bqtd = bqtd;
		}
		
		public void inclusaoBarco() {
			System.out.println("\n--------------------- CADASTRO ---------------------");
			System.out.println("Digite as informa��es sobre o Barco a ser cadastrado");
			inclusaoVeiculos();
			System.out.println("Informe o comprimento (p�s):");
			setPes(barco.nextInt());
			System.out.println("-----------------------------------------------------");
		}
		
		public void impressaoBarco() {
			System.out.println("\n--------------------- VISUZALIZA��O ---------------------");
			impressaoVeiculos();
			System.out.println("O comprimento (em p�s) do Ve�culo informado �: " + getPes());
			System.out.println("----------------------------------------------------------");
		}	
}