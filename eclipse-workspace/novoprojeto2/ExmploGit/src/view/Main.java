package view;

import SoController.SoController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoController soController = new SoController();
		System.out.println(soController.os());
		System.out.println(soController.version());
	}

}
