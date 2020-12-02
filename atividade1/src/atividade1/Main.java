//Robertson Nascimento - 391242
package atividade1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RevendaComArray principal = new RevendaComArray(50);
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		System.out.println("Aviso importante: Esse programa considera que os dados de entrada fornecidos pelo usuário fazem sentido.");
		System.out.println("Em outras palavras, o programa não trata entradas negativas de custos ou quantidade de produtos no estoque, por exemplo.");
		while(opcao != 12) {
			
			String menu = "\n############# // ################### // #################\n";
			menu += "Informe a opção correspondente a ação que deseja realizar:\n";
			menu += "1 | Criar e adicionar o produto ao estoque.\n";
			menu += "2 | Realizar compra de produtos já cadastrados.\n";
			menu += "3 | Vender produtos.\n";
			menu += "4 | Consultar preço de determinado produto.\n";
			menu += "5 | Listar preços de todos os produtos.\n";
			menu += "6 | Consultar valor de compra de um produto.\n";
			menu += "7 | Alterar valor de compra de um produto.\n";
			menu += "8 | Consultar custo de um produto.\n";
			menu += "9 | Alterar custo de um produto.\n";
			menu += "10 | Consultar margem de lucro de um produto.\n";
			menu += "11 | Alterar margem de lucro de um produto.\n";
			menu += "12 | Fechar o programa.";
			
			System.out.println(menu);
			opcao = ler.nextInt();
		
			switch(opcao) {
				case 1:{
					String s = "Você deseja criar e adicionar ao estoque um produto passando:\n";
					s += "1 | Código e descrição.\n";
					s += "2 | Código, descrição, valor da compra, custo e margem de lucro.\n";
					s += "3 | Código, descrição, valor da compra, custo, margem de lucro e quantidade no estoque.\n";
					System.out.println(s);
					int op = ler.nextInt();
					int cod;
					String descr;
					
					if(op == 1) {
						System.out.println("Código do produto:");
						cod = ler.nextInt();
						System.out.println("Descrição:");
						descr = ler.next();
						Produto p = new Produto(cod, descr);
						principal.inserirProduto(p);
						break;
					}
					if(op == 2) {
						System.out.println("Código do produto:");
						cod = ler.nextInt();
						System.out.println("Descrição:");
						descr = ler.nextLine();
						System.out.println("Valor da compra:");
						double valor = ler.nextDouble();
						System.out.println("Custo:");
						double custo = ler.nextDouble();
						System.out.println("Margem de lucro:");
						double lucro = ler.nextDouble();
						
						Produto p = new Produto(cod, descr, custo, valor, lucro);
						principal.inserirProduto(p);
						break;
					}
					if(op == 3) {
						System.out.println("Código do produto:");
						cod = ler.nextInt();
						System.out.println("Descrição:");
						descr = ler.nextLine();
						System.out.println("Valor da compra:");
						double valor = ler.nextDouble();
						System.out.println("Custo:");
						double custo = ler.nextDouble();
						System.out.println("Margem de lucro:");
						double lucro = ler.nextDouble();
						System.out.println("Quantidade em estoque:");
						int qtd = ler.nextInt();
						
						Produto p = new Produto(cod, descr, custo, valor, lucro, qtd);
						principal.inserirProduto(p);
						break;
					}
					System.out.println("Opção inválida.");
					break;
				}
				case 2:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					System.out.println("Quantidade de produtos adiquiridos:");
					int qtd = ler.nextInt();
					principal.comprar(cod, qtd);
					break;
				}
				case 3:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					System.out.println("Quantidade de produtos vendidos:");
					int qtd = ler.nextInt();
					principal.vender(cod, qtd);
					break;
				}
				case 4:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					principal.consultaPrecoVenda(cod);
					break;
				}
				case 5:{
					principal.listaPrecos();
					break;
				}
				case 6:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println(principal.getProdutos()[i].getValor_compra());
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 7:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println("Imforme o novo valor de compra do produto:");
							double n = ler.nextDouble();
							principal.getProdutos()[i].setValor_compra(n);
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 8:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println(principal.getProdutos()[i].getCusto());
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 9:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println("Imforme o novo custo compra do produto:");
							double n = ler.nextDouble();
							principal.getProdutos()[i].setCusto(n);
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 10:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println(principal.getProdutos()[i].getMargem_lucro());
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 11:{
					System.out.println("Código do produto:");
					int cod = ler.nextInt();
					boolean fim = false;
					for(int i=0; i <= principal.getIndice(); i++) {
						if(principal.getProdutos()[i].getCodigo() == cod) {
							System.out.println("Imforme a nova margem de lucro do produto:");
							double n = ler.nextDouble();
							principal.getProdutos()[i].setMargem_lucro(n);
							fim = true;
						}
					}
					if(fim) break;
					System.out.println("Erro: produto não encontrado no estoque.");
					break;
				}
				case 12:{
					System.out.println("Fechando o programa.");
					break;
				}
				default:
					System.out.println("Opção inválida");
					break;
			}
		}
		ler.close();
	}
}

















