package org.caferrerb.drawer.compilador;

import java.io.StringReader;

import org.caferrerb.drawer.parser.DrawGrammar;
import org.caferrerb.drawer.parser.MyNewGrammar;

public class Compilador {

	private String codigoExec;
	private MyNewGrammar gramma;
	private String console;

	public Compilador() {
		gramma = new MyNewGrammar(new StringReader(""));
	}

	private void compilar(String codigo) throws Exception {
		gramma.ReInit(new StringReader(codigo));
		gramma.dibujo();
		
	}

	public String run(String codigo) throws Exception {
		compilar(codigo);
		
		return "";
       
	}
}
