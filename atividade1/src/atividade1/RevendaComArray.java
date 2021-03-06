//Robertson Nascimento - 391242
package atividade1;

public class RevendaComArray {
	private Produto produtos[];
	private int indice = -1;
	private int qtd;
	
	RevendaComArray(int qtdade){
		produtos = new Produto[qtdade];
		qtd = qtdade;
	}
	void inserirProduto(Produto p) {
		if(indice+1 == qtd)
			return;
		
		indice++;
		produtos[indice] = p;
	}
	/*
	 * Um método "comprar" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
produto que foi adquirida pela revenda, percorre o array procurando o Produto e incrementa a quantidade em
estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro;
	 */
	void comprar(int cod, int qtd_unidades) {
		for(int i=0; i <= indice; i++) {
			if(produtos[i].getCodigo() == cod) {
				produtos[i].compra(qtd_unidades);
				return;
			}
		}
		System.out.println("Erro: produto informado não encontrado.");
	}
	
	/*
	 * Um método "vender" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
	produto que foi vendida pela revenda, percorre o array procurando o Produto e decrementa a quantidade em
	estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro; 
	 */
	void vender(int cod, int qtd_vendida) {
		for(int i=0; i <= indice; i++) {
			if(produtos[i].getCodigo() == cod) {
				produtos[i].venda(qtd_vendida);
				return;
			}
		}
		System.out.println("Erro: produto informado não encontrado.");
	}
	
	/*
	 * Um método "consultaPrecoVenda" que recebe como parâmetro o código de um Produto, percorre o array
procurando o Produto e imprime o valor de venda deste produto, caso ele não exista, o método deve imprimir
uma mensagem de erro; 
	 */
	void consultaPrecoVenda(int cod) {
		for(int i=0; i <= indice; i++) {
			if(produtos[i].getCodigo() == cod) {
				System.out.println(produtos[i].calculaPrecoVenda());
				return;
			}
		}
		System.out.println("Erro: produto informado não encontrado.");
	}
	/*
	 * Um método "listaPrecos" que imprime o código, a descrição e o valor de venda de todos os produtos;
	 */
	void listaPrecos() {
		for(int i=0; i <= indice; i++) {
			System.out.println("Código do produto: " + produtos[i].getCodigo());
			System.out.println("Descrição: " + produtos[i].getDescricao());
			System.out.println("Preço: " + produtos[i].calculaPrecoVenda());
			System.out.println();
		}
	}
	Produto[] getProdutos() {
		return produtos;
	}
	int getIndice() {
		return indice;
	}
}
















