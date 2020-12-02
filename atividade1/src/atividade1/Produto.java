//Robertson Nascimento - 391242
package atividade1;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor_compra = 0;
	private double custo = 0;
	private double margem_lucro = 0;
	private int qtd_estoque = 0;
	
	Produto(int cod, String desc){
		codigo = cod;
		descricao = desc;
	}
	Produto(int cod, String desc, double valor_compr, double cust, double margem_lucr){
		codigo = cod;
		descricao = desc;
		valor_compra = valor_compr;
		custo = cust;
		margem_lucro = margem_lucr;
	}
	Produto(int cod, String desc, double valor_compr, double cust, double margem_lucr, int qtd_estoq){
		codigo = cod;
		descricao = desc;
		valor_compra = valor_compr;
		custo = cust;
		margem_lucro = margem_lucr;
		qtd_estoque = qtd_estoq;
	}
	
	void compra(int quant){
		qtd_estoque = qtd_estoque + quant;
	}
	void venda(int quant){
		if(qtd_estoque >= quant)
			qtd_estoque = qtd_estoque - quant;
		else
			System.out.println("Erro: quantidade de produtos no estoque insuficiente.");
	}
	double calculaPrecoVenda(){
		return valor_compra + custo + margem_lucro*(valor_compra + custo);
	}
	void setValor_compra(double n){
		valor_compra = n;
	}
	double getValor_compra() {
		return valor_compra;
	}
	void setCusto(double n) {
		custo = n;
	}
	double getCusto() {
		return custo;
	}
	void setMargem_lucro(double n) {
		margem_lucro = n;
	}
	double getMargem_lucro() {
		return margem_lucro;
	}
	double getCodigo() {
		return codigo;
	}
	String getDescricao() {
		return descricao;
	}
}
