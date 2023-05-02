package serrano.victor.itacademy.acces.especialitzacio.java.exercici1;

import java.util.ArrayList;


public class Documento {
	
	public Documento() {
		parrafos = new ArrayList<String>();
	}
	
	private ArrayList<String> parrafos;
	private String titulo;
	
	private int numeroParrafos;
	
	
	

	/*1. Agregar los métodos getter/setter de todas las propiedades privadas que se encuentran en la
	clase anterior.*/
	public ArrayList<String> getParrafos() {
		return parrafos;
	}

	public void setParrafos(ArrayList<String> parrafos) {
		this.parrafos = parrafos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/*
	 * 2. Agregar una propiedad llamada númeroParagrafs, con el correspondiente método
		getter, que devuelva el número de párrafos de que consta el documento, utilizando el
		método adecuado de la propiedad párrafos.

	 */
	
	public int getNumeroParrafos() {
		return numeroParrafos;
	}

	/*
	 * Con el método adecuado de la propiedad párrafos, deberás devolver el texto correspondiente
		en la posición indicada. En caso de que no haya ningún texto en este índice, tendrás que tirar
		una RuntimeException con el texto "No hay ningún párrafo en la posición indicada".

	 */
	
	public String getParrafo(int index) {
		
		String texto ="";
		
		try {
			
			texto = parrafos.get(index);
			
		} catch (RuntimeException e) {
			System.out.println("Error, no hay ningún párrafo en la posición indicada");	
		}
		
		return texto;
		
	}
	
	/*
	 * 4. Agregar el método setParagraf, que recibirá como parámetros un número entero y una
		cadena alfanumérica. El primero representará el índice donde se quiere incluir el texto pasado en el
		segundo parámetro.
	 */
	/*
	 * Con los métodos adecuados de la propiedad párrafos, deberás hacer lo siguiente:
	- Si ya existe un texto en la posición indicada, deberá modificarse por el nuevo texto.
	 En caso de que en la posición indicada no existe ningún texto, deberá añadirse.

	 */
	
	 public boolean isIndexPositivo(int index) {
		 
	        return index >= 0;
	        
	    }
	
	 public boolean isIndexValido(int index) {
		 
	        return index > parrafos.size();
	        
	    }
	 
	 public boolean isIndexExiste(ArrayList<String> parrafos, int index) {
		 
		 String texto; 
		 try {
		    texto = parrafos.get(index).toString();
		 } catch (IndexOutOfBoundsException e) {
		    return false;
		 }
		   return true;
	}
	
	public void setParrafos(int indice, String texto) {
		
			if (!isIndexPositivo(indice))
				throw new ControlarException("Error, indece negativo");
			else if (isIndexValido(indice))
				throw new ControlarException("Error, indice fuera de rango");
			else if (isIndexExiste(parrafos, indice))
				parrafos.set(indice, texto);
			else
				parrafos.add(indice, texto);	
		
	}
	
}
