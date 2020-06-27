package Fatec;

public class LinhaVermelho extends CorDaLinhaDecorator {

	public LinhaVermelho(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Linha Vermelha";
		return cor;
	}
}
