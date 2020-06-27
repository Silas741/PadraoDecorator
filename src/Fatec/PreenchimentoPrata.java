package Fatec;

public class PreenchimentoPrata extends CorDePreenchimentoDecorator {

	public PreenchimentoPrata(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor = "Preenchimento Prata";
		return cor;
	}

}
