import semantico.VisitorIdentificacion;
import semantico.VisitorSemantico;
import sintactico.Parser;
import generadorCodigo.GeneradorCodigo;
import generadorCodigo.VisitorGCEjecutar;
import generadorCodigo.VisitorOffset;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import ast.ME;
import lexico.Lexico;

public class Main {

	public static void main(String args[]) throws IOException {
		/*if (args.length < 1) {
			System.err.println("Necesito el archivo de entrada.");
			return;
		}

		FileReader fr = null;
		try {
			fr = new FileReader(args[0]);
		} catch (IOException io) {
			System.err.println("El archivo " + args[0]
					+ " no se ha podido abrir.");
			return;
		}
*/
		try {
		 System.out.print ("\n--- Introduce el fichero que contiene el programa a ejecutar\n(Introducir ProgramaDemostracion.txt para ver una demostración): ");
         
         InputStreamReader input = new InputStreamReader(System.in);
         BufferedReader buffer = new BufferedReader (input);
         
         String programa = buffer.readLine();
         
         File file = new File ("src/Entrada/" + programa); // Luego cambiar / por \\ pa entregar
     
         if (! (file.exists())) {
         
             System.out.println("\n\nEl fichero indicado no existe en la ruta /src/Entrada");
             return;
         }

		Lexico lexico = new Lexico(new FileReader("src/Entrada/" + programa));
		Parser parser = new Parser(lexico);
		/*
		 * int token; while ((token=lexico.yylex())!=0) {
		 * System.out.println("Linea: "+lexico.getYyline()+
		 * ", columna: "+lexico.getYycolumn()+ ", token: "+token+
		 * ", valor semï¿½ntico: "+parser.getYylval()+"."); }
		 */
		String archivoSalida = "salida.txt";
		FileWriter fw = new FileWriter(archivoSalida);
		
		parser.run();
		if(parser.ast != null){
		parser.ast.accept(new VisitorIdentificacion(), null);
		parser.ast.accept(new VisitorSemantico(), null);
		}
		if (ME.mE.huboErrores())
			ME.mE.mostrarErrores(System.err);
		else {
			parser.ast.accept(new VisitorOffset(), null);
			GeneradorCodigo.out = fw;
			GeneradorCodigo.source(programa);
			parser.ast.accept(new VisitorGCEjecutar(), null);
			fw.close();
			IntrospectorModel modelo = new IntrospectorModel("Programa",
					parser.ast);
			new IntrospectorTree("Introspector", modelo);
		}
		}

        catch (IOException e) {

            System.out.println(e);
        }
	}
		

}