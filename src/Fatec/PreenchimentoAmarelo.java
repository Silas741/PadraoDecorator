package Fatec;

public class PreenchimentoAmarelo extends CorDePreenchimentoDecorator {

	public PreenchimentoAmarelo(Geometricas geometricas) {
		super(geometricas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		String cor ="Preenchimento Amarelo";
		return cor;
	}

}
