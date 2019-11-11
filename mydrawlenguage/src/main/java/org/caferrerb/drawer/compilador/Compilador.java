package org.caferrerb.drawer.compilador;

import java.io.StringReader;

import org.caferrerb.drawer.parser.DrawGrammar;

public class Compilador {

	private String codigoExec;
	private DrawGrammar gramma;
	private String console;

	public Compilador() {
		gramma = new DrawGrammar(new StringReader(""));
	}

	private void compilar(String codigo) throws Exception {
		gramma.ReInit(new StringReader(codigo));
		gramma.draw();
		
	}

	public String run(String codigo) throws Exception {
		compilar(codigo);
		
		return "";
       
	}
}
