package LojaDeEsportes;

import java.util.ArrayList;

public class Produtos1 {

	public static void main(String[] args) {
		ArrayList <String> itens = new ArrayList<String>();
		
			itens.add("Camisas");
			itens.add("Bolas");
			itens.add("Tenis");
			itens.add("Shorts");
		
			System.out.println(itens.toString());
		
			itens.remove(3);
			System.out.println(itens.toString());
		
			itens.set(1, "Meias");
			System.out.println(itens.toString());

		
	}

}
