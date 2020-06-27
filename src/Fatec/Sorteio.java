package Fatec;

import java.util.Random;

import javax.swing.JOptionPane;

public class Sorteio {
	Geometricas geometricas = null;

	public void MenuFormas() {
		String Menu = "Sorteio\n 1 - Circulo \n2 - Quadrado \n3 - Retangulo";
		JOptionPane.showMessageDialog(null, Menu);
	}

	public void MenuPreenchimento() {
		String MenuPreenchimento = "Sorteio\n 1 - Amarelo \n2 - Azul \n3 - Prata \n4 - Preto";
		JOptionPane.showMessageDialog(null, MenuPreenchimento);
	}

	public void MenuLinha() {
		String MenuLinha = "Sorteio\n 1 - Azul \n2 - Roxo \n3 - Verde \n4 - Vermelho";
		JOptionPane.showMessageDialog(null, MenuLinha);

	}

	public void SorteioGeo() {
		MenuFormas();
		Random sorteioFormas = new Random();
		int opSorteioFormas = 1 + sorteioFormas.nextInt(3);
		switch (opSorteioFormas) {
		case 1:
			geometricas = new Circulo();
			System.out.println(geometricas.desenhar());
			break;
		case 2:
			geometricas = new Quadrado();
			System.out.println(geometricas.desenhar());
			break;
		case 3:
			geometricas = new Retangulo();
			System.out.println(geometricas.desenhar());
			break;
		}
	}

	public void SorteioPreenchimento() {
		MenuPreenchimento();
		Random SorteioPreenchimento = new Random();
		int opSorteioPreenchimento = 1 + SorteioPreenchimento.nextInt(4);
		switch (opSorteioPreenchimento) {
		case 1:
			geometricas = new PreenchimentoAmarelo(geometricas);
			System.out.println(geometricas.desenhar());
			break;
		case 2:
			geometricas = new PreenchimentoAzul(geometricas);
			System.out.println(geometricas.desenhar());
			break;
		case 3:
			geometricas = new PreenchimentoPrata(geometricas);
			System.out.println(geometricas.desenhar());
		case 4:
			geometricas = new PreenchimentoPreto(geometricas);
			System.out.println(geometricas.desenhar());
			break;
		}
	}

	public void SorteioCorLinha() {
		MenuLinha();
		Random sorteioCorLinha = new Random();
		int opSorteioCorLinha = 1 + sorteioCorLinha.nextInt(4);
		switch (opSorteioCorLinha) {
		case 1:
			geometricas = new LinhaAzul(geometricas);
			System.out.println(geometricas.desenhar());
			break;
		case 2:
			geometricas = new LinhaRoxo(geometricas);
			System.out.println(geometricas.desenhar());
			break;
		case 3:
			geometricas = new LinhaVerde(geometricas);
			System.out.println(geometricas.desenhar());
		case 4:
			geometricas = new LinhaVermelho(geometricas);
			System.out.println(geometricas.desenhar());
		}

	}

	public void SorteioDoDecorador(int optDecorador) {
		SorteioGeo();
		if (optDecorador == 1) {
			JOptionPane.showMessageDialog(null, "Foi sorteado o Decorador da linha");
			SorteioCorLinha();
		} else {
			JOptionPane.showMessageDialog(null, "Foi sorteado o Decorador do preenchimento");
			SorteioPreenchimento();
		}
	}
}
