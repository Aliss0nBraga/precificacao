package precificacao;

public class Produto {
	public String nome;
	public float precoDeCusto;
	public byte quantidade; 
	
	public float calcularPrecoDeVenda(float custoFixo, float lucroLiquido) {
		float totalDaCompra = this.precoDeCusto * this.quantidade;
		float faturamento = custoFixo + totalDaCompra + lucroLiquido;
		return faturamento / this.quantidade;	

	}
}	

