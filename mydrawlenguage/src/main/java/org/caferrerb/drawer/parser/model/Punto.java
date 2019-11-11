package org.caferrerb.drawer.parser.model;

public class Punto extends ElementoSintactico {

	private Parametro x,y;
	
	public Punto() {
	}
	
	public Punto(Parametro x, Parametro y) {
		super();
		this.x = x;
		this.y = y;
		addHijo(x);
		addHijo(y);
	}

	@Override
	public String parse() {
		return "java.awt.Point(" +x.parse()+","+y.parse()+")";
	}

	public Parametro getX() {
		return x;
	}

	public void setX(Parametro x) {
		this.x = x;
	}

	public Parametro getY() {
		return y;
	}

	public void setY(Parametro y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "punto";
	}

}
