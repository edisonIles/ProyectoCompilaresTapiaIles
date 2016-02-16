package generadorCodigo;

import ast.AccesoArray;
import ast.AccesoCampo;
import ast.Aritmetica;
import ast.Asignacion;
import ast.Campo;
import ast.Cast;
import ast.Comparacion;
import ast.DefVariable;
import ast.Definicion;
import ast.DefinicionFuncion;
import ast.Escritura;
import ast.Expresion;
import ast.InvocacionFuncion;
import ast.InvocacionProcedimiento;
import ast.Lectura;
import ast.LiteralCaracter;
import ast.LiteralEntero;
import ast.LiteralReal;
import ast.Logica;
import ast.MenosUnario;
import ast.Negacion;
import ast.OCondTernario;
import ast.Programa;
import ast.RestaUnitaria;
import ast.RestaUnitariaBef;
import ast.Return;
import ast.Sentencia;
import ast.SentenciaIF;
import ast.SentenciaWhile;
import ast.SumatorioUnitario;
import ast.SumatorioUnitarioBef;
import ast.TipoError;
import ast.Variable;
import ast.Visitor;
import ast.tipos.TipoArray;
import ast.tipos.TipoCaracter;
import ast.tipos.TipoEntero;
import ast.tipos.TipoFuncion;
import ast.tipos.TipoReal;
import ast.tipos.TipoRegistro;
import ast.tipos.TipoVoid;

public class VisitorDefaultErrores implements Visitor {

	@Override
	public Object visit(MenosUnario menosUnario, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (menosUnario). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Variable variable, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (variable). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoError tipoError, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoError). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(SentenciaWhile sentenciaWhile, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (sentenciaWhile). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(SentenciaIF sentenciaIF, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (sentenciaIF). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Return retorno, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (retorno). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Programa programa, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (programa). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Negacion negacion, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (negaci�n). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Logica logica, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (l�gica). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(LiteralEntero literalEntero, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (literalEntero). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(LiteralReal literalReal, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (literalReal). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(LiteralCaracter literalCaracter, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (literalCaracter). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Lectura lectura, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (lectura). No se deber�a pasar por aqu�");

	}

	@Override
	public Object visit(InvocacionProcedimiento invocacionProcedimiento,
			Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (invocacionProcedimiento). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(InvocacionFuncion invocacionFuncion, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (invocacionFuncion). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Escritura escritura, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (escritura). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(DefVariable defVariable, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (defVariable). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(DefinicionFuncion definicionFuncion, Object params) {
		definicionFuncion.tipo.accept(this, params);
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (definicionFuncion). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Comparacion comparacion, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (comparacion). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Cast cast, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (cast). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Campo campo, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (campo). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Asignacion asignacion, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (asignacion). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(Aritmetica aritmetica, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (aritmetica). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(AccesoCampo accesoCampo, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (accesoCampo). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(AccesoArray accesoArray, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (accesoArray). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoVoid tipoVoid, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoVoid). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoRegistro tipoRegistro, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoRegistro). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoReal tipoReal, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoReal). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoEntero tipoEntero, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoEntero). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoCaracter tipoCaracter, Object params) {

		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoCaracter). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoArray tipoArray, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoArray). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(TipoFuncion tipoFuncion, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (tipoFuncion). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(SumatorioUnitario sumatorioUnitario, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (sumatorioUnitario). No se deber�a pasar por aqu�");

	}

	@Override
	public Object visit(RestaUnitaria restaUnitaria, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (restaUnitaria). No se deber�a pasar por aqu�");
	}

	@Override
	public Object visit(SumatorioUnitarioBef sumatorioUnitarioBef, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (sumatorioUnitarioBef). No se deber�a pasar por aqu�");

	}
	
	@Override
	public Object visit(RestaUnitariaBef restaUnitariaBef, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (restaUnitariaBef). No se deber�a pasar por aqu�");

	}

	@Override
	public Object visit(OCondTernario oCondTernario, Object params) {
		throw new RuntimeException(
				"Excepci�n en fase del sem�ntico (oCondTernario). No se deber�a pasar por aqu�");

	}

}
