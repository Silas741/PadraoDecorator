package Fatec;

public class LinhaAzul extends CorDaLinhaDecorator {

	public LinhaAzul(Geometricas geometricas) {
		super(geometricas);
		
	}
	@Override
	public String desenhar() {
		String cor ="Linha Azul";
		return cor;
	}
}
