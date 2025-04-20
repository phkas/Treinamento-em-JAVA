package loja_de_roupas;

public class Roupa {
	public String tipo;     //EX: Camisa, Calça, Blusa e  ETC
	public String marca;    
	public String tamanho;  // Tamanho da roupa ex: P, M, GG
	public int quantidade;  //Quantidade em estoque
	public double valor;    //Valor da peça
	
	// MÉTODOS
	
	// retorna o valor total do estoque (quantidade * valor)
	public double valorTotal() {
		double valorTotalEstoque = quantidade * valor;
		return valorTotalEstoque;
	}
	
	
	// Decrementar qtd no estoque, garantindo que não seja possivel remover mais peças
	public boolean removEstoque (int quantidadeRem) {
		if (quantidadeRem <= 0) {
			System.out.println("Quantidade inválida para remover.");
			return false;
		
		}
		
		if (quantidadeRem > this.quantidade) {
			System.out.println("\n Estoque insuficiente para remover " + quantidadeRem + " \n unidades.");
			return false;
		}
		
		
		this.quantidade -= quantidadeRem;
		System.out.println("Remoção realizada. \n Estoque atual");
		return true;
		
		
	}
	
	// incrementando qtd no estoque
	public boolean addEstoque (int quantidadeAdd) {
		if (quantidadeAdd <= 0) {
			System.out.println("Quantidade inválida.");
			return false;
		}
		
		this.quantidade += quantidadeAdd;
		System.out.println("\n Boa! \n Adição realizada com sucesso. \n Estoque atual: " + this.quantidade);
        return true;	
	}
		
	

}
