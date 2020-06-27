package Fatec;

public class PreenchimentoAzul extends CorDePreenchimentoDecorator {

	public PreenchimentoAzul(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Preenchimento Azul";
		return cor;
	}

}
