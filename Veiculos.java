package veiculos; 
import java.util.Scanner;

public class Veiculos {
												/* Atributos */
			private String placa="";
			private String cor="";
			private String marca="";
			
	Scanner veiculo = new Scanner(System.in);
		
												/* Encapsulamento dos atributos criados */	
			
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public void inclusaoVeiculos() {
			System.out.println("Informe a placa:");
			setPlaca(veiculo.nextLine());
			System.out.println("Informe a cor:");
			setCor(veiculo.nextLine());
			System.out.println("Informe a marca:");
			setMarca(veiculo.nextLine());
		}
		
		public void impressaoVeiculos() {
			System.out.println("A placa do Veículo informado é: " + getPlaca());
			System.out.println("A cor do Veículo informado é: " + getCor());
			System.out.println("A marca do Veículo informado é: " + getMarca());
		}
}