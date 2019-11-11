package org.caferrerb.drawer.parser.model;

public class Circulo extends ElementoSintactico {

	private Punto pc;
	private Parametro xc;
	private Parametro yc;
	private Parametro radio;
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(Punto pc, Parametro radio) {
		super();
		this.pc = pc;
		this.radio = radio;
	}
	

	public Circulo(Punto pc, Parametro xc, Parametro yc, Parametro radio) {
		super();
		this.pc = pc;
		this.xc = xc;
		this.yc = yc;
		this.radio = radio;
		
		if(pc!=null) {
			addHijo(pc);
		}else {
			addHijo(xc);
			addHijo(yc);
		}
		
		addHijo(radio);
	}



	@Override
	public String parse() {
		// TODO Auto-generated method stub
		return null;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "circulo";
}

	public Punto getPc() {
		return pc;
	}



	public void setPc(Punto pc) {
		this.pc = pc;
	}



	public Parametro getXc() {
		return xc;
	}



	public void setXc(Parametro xc) {
		this.xc = xc;
	}



	public Parametro getYc() {
		return yc;
	}



	public void setYc(Parametro yc) {
		this.yc = yc;
	}



	public Parametro getRadio() {
		return radio;
	}



	public void setRadio(Parametro radio) {
		this.radio = radio;
	}
	
	
	

}
