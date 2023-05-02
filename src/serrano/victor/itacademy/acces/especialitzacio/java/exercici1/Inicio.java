package serrano.victor.itacademy.acces.especialitzacio.java.exercici1;

import java.util.ArrayList;

public class Inicio {
	
	public static void main(String args[]) {
		/*
		5. En el mismo paquete donde se encuentra la clase Document, crea una clase llamada Inicio, que
		contenga el punto de entrada en la aplicación, e instanciando la clase Documento en la variable
		documentTest, ejecuta los siguientes llamamientos para comprobar que funciona
		correctamente:

		documentTest.getNombreParagrafs(); //Mostra el resultat a la consola
		documentTest.setParagraf(0, “Text 0”);
		documentTest.setParagraf(1, “Text 1”);
		documentTest.setParagraf(2, “Text 2”);
		documentTest.setParagraf(3, “Text 3”);
		documentTest.getParagraf(1); //Mostra el resultat a la consola
		documentTest.getParagraf(5); //Tracta l’excepció mostrant el missatge 
		d’error a la consola
		documentTest.setParagraf(2, “Text 2 modificat”);

		*/
		
		Documento documentoTest = new Documento();
		documentoTest.getNumeroParrafos();
		documentoTest.setParrafos(0, "Text 0");
		documentoTest.setParrafos(1, "Text 1");
		documentoTest.setParrafos(2, "Text 2");
		documentoTest.setParrafos(3, "Text 3");
		
		 //Mostra el resultat a la consola
	    System.out.println(documentoTest.getParrafo(0));
	    
	    //Trata la excepción mostrando el mensaje de error en la consola
	    documentoTest.getParrafo(7);
	    
	    try {
	    	 documentoTest.setParrafos(2, "Text 2 Modificado");
	  	     System.out.println(documentoTest.getParrafo(2));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	  
	    
	   /*
	    * Ahora, guarda el retorno del método documentTest.getParagrafs() a una
		variable del tipo adecuado, y recorrela con un bucle for mostrando por
		consuela cada ocurrencia, demostrando que el contenido final del
		documento es:

		Text 0	
		Text 1 
		Text 2 modificat 
		Text 3
 
	    */
	    System.out.println();
	    
	    ArrayList<String> documento2 = new ArrayList<String>();
	    
	    documento2=documentoTest.getParrafos();
	    
	    for (int i=0; i< documento2.size(); i++) {
	    	
	    	System.out.println(documento2.get(i));
	    	
	    }
	    
	}

}
