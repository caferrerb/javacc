package org.caferrerb.drawer.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Dibujo extends ElementoSintactico {

	private List<ElementoSintactico> sentencias;

	public Dibujo() {
		sentencias = new ArrayList<ElementoSintactico>();
	}

	public void addSentencia(ElementoSintactico sentencia) {
		sentencias.add(sentencia);
		addHijo(sentencia);
	}
	
	@Override
	public String parse() {
		// TODO Auto-generated method stub
		return null;
	}

}
