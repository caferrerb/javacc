package org.caferrerb.drawer.parser.model;

public class Asignacion extends ElementoSintactico {

	private String identificador;
	private String rightSide;
	
	
	public Asignacion() {
		// TODO Auto-generated constructor stub
	}
	
	public Asignacion(String identificador, String rightSide) {
		super();
		this.identificador = identificador;
		this.rightSide = rightSide;
		addHijo(new Parametro(identificador));
		addHijo(new Parametro(rightSide));
	}

	@Override
	public String parse() {
		return identificador + "=" + rightSide;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "asignacion";
	}

}
