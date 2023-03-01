package view;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		
		SomatorioController sn = new SomatorioController();
		int n = 5;
		int somatorio = sn.somatorio(n);
		
		System.out.println(somatorio);
	}

}
