package Fatec;

public class PreenchimentoPreto extends CorDePreenchimentoDecorator {

	public PreenchimentoPreto(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Preenchimento Preto";
		return cor;
	}

}
