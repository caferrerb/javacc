package org.caferrerb.drawer.parser.model;

public class Rectangulo extends ElementoSintactico {


	private Punto p1,p2;
	private Parametro x1,y1,x2,y2;
	
	public Rectangulo(Punto p1, Punto p2, Parametro x1, Parametro y1, Parametro x2, Parametro y2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		if (p1!=null) {
			addHijo(p1);
			
			if(p2!=null) {
				addHijo(p2);
			}else {
				addHijo(x2);
				addHijo(y2);
			}
		}else {
			addHijo(x1);
			addHijo(y1);
			if(p2!=null) {
				addHijo(p2);
			}else {
				addHijo(x2);
				addHijo(y2);
			}
		}
	}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Rectangulo";
}
	@Override
	public String parse() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Parametro getX1() {
		return x1;
	}

	public void setX1(Parametro x1) {
		this.x1 = x1;
	}

	public Parametro getY1() {
		return y1;
	}


	public void setY1(Parametro y1) {
		this.y1 = y1;
	}



	public Parametro getX2() {
		return x2;
	}



	public void setX2(Parametro x2) {
		this.x2 = x2;
	}



	public Parametro getY2() {
		return y2;
	}



	public void setY2(Parametro y2) {
		this.y2 = y2;
	}
	
	
	
	
}
