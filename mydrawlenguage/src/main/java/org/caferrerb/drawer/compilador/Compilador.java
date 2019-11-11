package org.caferrerb.drawer.compilador;

import java.io.StringReader;

import javax.swing.tree.TreeNode;

import org.caferrerb.drawer.parser.DrawGram;

public class Compilador {

	private String codigoExec;
	private DrawGram gramma;
	private String console;
	private TreeNode raiz;
	public Compilador() {
		gramma = new DrawGram(new StringReader(""));
	}

	private void compilar(String codigo) throws Exception {
		gramma.ReInit(new StringReader(codigo));
		raiz = gramma.draw();
		
	}

	public String run(String codigo) throws Exception {
		compilar(codigo);
		
		return "";
       
	}

	public TreeNode getRaizDerivacion() {
		// TODO Auto-generated method stub
		return raiz;
	}
	
}
