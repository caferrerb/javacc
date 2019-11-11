package org.caferrerb.drawer.parser.model;

public class Parametro extends ElementoSintactico {

	private String value;

	public Parametro(String value) {
		this.value = value;
	}
	
	public Parametro() {
	}

	@Override
	public String parse() {
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "parametro:" + value;
	}
}
