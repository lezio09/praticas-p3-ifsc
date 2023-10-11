package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
	
		
		Produto prdt = new Produto();
		prdt.setNome("Super Carro");
		prdt.setCodBarras(1002763l);
		prdt.setPreco(50000000.00);
		prdt.setFornecedor("McLaren");
		produtos.add(prdt);

		Produto prdt1 = new Produto();
		prdt1.setNome("Carro popular");
		prdt1.setCodBarras(10022300l);
		prdt1.setPreco(400000.00);
		prdt1.setFornecedor("Honda");
		produtos.add(prdt1);
	
		Produto prdt2 = new Produto();
		prdt2.setNome("Carro particular");
		prdt2.setCodBarras(90032368l);
		prdt2.setPreco(1000000.00);
		prdt2.setFornecedor("Jeep");
		produtos.add(prdt2);
		
		
		for (Produto produto : produtos) {
		
		System.out.println(produto.getNome());
		System.out.println(produto.getCodBarras());
		System.out.println(produto.getPreco());
		System.out.println(produto.getFornecedor());
		System.out.println();
		
		}
		

	}

}
