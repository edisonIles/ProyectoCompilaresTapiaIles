package ast;
import java.util.ArrayList;
import java.util.List;


public class Escritura implements Sentencia {
	
	public int linea, columna;
	public List<Expresion> expresiones = null;
	public boolean lvalue;
	
	public Escritura(int linea, int columna, List<Expresion> expresiones){
		this.linea = linea;
		this.columna = columna;
		this.expresiones = new ArrayList<Expresion>();
		this.expresiones = expresiones;
		
		
		
	}

	public void accept(Visitor v, Object params){
		v.visit(this, params);
	}
	
	
	@Override
	public String toString(){
		String mensaje = "write ";
		
		for(Expresion exp : expresiones)
			mensaje += exp.toString() + ",";
		
		return mensaje;
	}

	@Override
	public boolean getLValue() {
		return lvalue;
	}
	
	@Override
	public int getLinea(){
		return this.linea;
	}

}
