package Fatec;

public class LinhaRoxo extends CorDaLinhaDecorator {

	public LinhaRoxo(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Linha roxa";
		return cor;
	}

}
