package precificacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto prod = new Produto();
		
		System.out.println("Digite o nome do produto:");
		prod.nome = teclado.nextLine();
		System.out.println("Digite a quantidade do produto:");
		prod.quantidade = teclado.nextByte();
		System.out.println("Digite o precoDeCusto únitario do produto:");
		prod.precoDeCusto = teclado.nextFloat(); 
		
		System.out.println("Digite o custo fixo");
		float custoFixo = teclado.nextFloat();
		System.out.println("Digite o lucro Líquido");
		float lucro = teclado.nextFloat();
		
		float precoDeVenda = prod.calcularPrecoDeVenda(custoFixo, lucro);
		System.out.printf("Você deverá vender o produto %s a um preço de R$ %.2f",prod.nome,precoDeVenda);
	}	
}
