package Fatec;

public abstract class Geometricas {
	private String description;

	public String getdescription() {
		return description;
	}

	public  String desenhar() {
		return getClass().getSimpleName();
	}
}
