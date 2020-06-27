package Fatec;

public class LinhaVerde extends CorDaLinhaDecorator {

	public LinhaVerde(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Linha verde";
		return cor;
	}

}
