package org.caferrerb.drawer.parser;

public class ParseManager {

	private StringBuilder code;
	
	public ParseManager() {
		
		code = new StringBuilder();
	}
	
	public void appendCode(String codePart) {
		code.append(codePart);
	}
	
	public String getCode() {
		return code.toString();
	}
}
