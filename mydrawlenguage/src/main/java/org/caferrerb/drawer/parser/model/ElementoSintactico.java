package org.caferrerb.drawer.parser.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.TreeNode;

public abstract class ElementoSintactico implements TreeNode {
	
	private List<ElementoSintactico> hijos = new ArrayList<ElementoSintactico>();
	
	public void addHijo(ElementoSintactico hijo) {
		hijos.add(hijo);
	}
	
	public abstract String  parse();

	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return hijos.get(childIndex);
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return hijos.size();
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return hijos.isEmpty();
	}

	@Override
	public Enumeration<? extends TreeNode> children() {
		// TODO Auto-generated method stub
		return Collections.enumeration(hijos);
	}

}
