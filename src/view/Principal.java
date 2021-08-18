package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController opCont = new OperacoesController();
		opCont.Buffer1000();
		opCont.Buffer10000();
		opCont.Buffer100000();
	}

}