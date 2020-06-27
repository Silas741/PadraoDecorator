package Fatec;

public abstract class CorDaLinhaDecorator extends Geometricas {

	private Geometricas geometricas;
	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return super.getdescription();
	}
	public void setGeometricas(Geometricas geometricas) {
		this.geometricas = geometricas;
	}
	public Geometricas getGeometricas() {
		return geometricas;
	}
	public CorDaLinhaDecorator (Geometricas geometricas) {
		this.geometricas = geometricas;
	}
}
