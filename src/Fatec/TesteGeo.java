package Fatec;

import java.util.Random;

import javax.swing.JOptionPane;

public class TesteGeo {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int numerosSorteados = sorteio.nextInt(4);
		Sorteio gerarNumeroDoSorteio = new Sorteio();
		
		String menuEscolhaAleatoria = "Sorteado 0, a figura sera desenhada sem um decorador."
				+"\n Sorteado 1, o decorador utilzado é aleatorio \nSorteado 2, Sera decorado com os 2 decoradores.";
		JOptionPane.showMessageDialog(null, menuEscolhaAleatoria);
				
		switch (numerosSorteados) {
		case 0:
			JOptionPane.showMessageDialog(null, "Foi sorteado 0");
			gerarNumeroDoSorteio.SorteioGeo();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Foi sorteado 1");
			Random sorteioOpcDecorador = new Random();
			int opcSorteioDecorador = 1 + sorteioOpcDecorador.nextInt(2);
			gerarNumeroDoSorteio.SorteioDoDecorador(opcSorteioDecorador);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Foi sorteado 2");
			gerarNumeroDoSorteio.SorteioGeo();
			gerarNumeroDoSorteio.SorteioCorLinha();
			gerarNumeroDoSorteio.SorteioPreenchimento();
			break;
		default:
			break;
		}

}
}
