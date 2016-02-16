package ast;
 /**

 *Interfaz del nodo del Arbol Abstracto Sintactico
 */
public interface NodoAST {
	
	/**
	 * En caso de depuraci�n me servir� para saber en que l�nea fall�
	 * @return entero con la l�nea donde se encuentra el c�digo
	 */
	//public int getLinea(); ya no se necesita puesto que se accede 
	//directamente (variables p�blicas por cuesti�n de eficiencia)
	
	/**
	 * En caso de depuraci�n me servir� para saber en que columna fall�
	 * @return entero con la columna donde se encuentra el c�digo
	 */
	//public int getColumna(); ya no se necesita puesto que se accede 
	//directamente (variables p�blicas por cuesti�n de eficiencia)

	public void accept(Visitor v, Object params);
	public boolean getLValue();
}
