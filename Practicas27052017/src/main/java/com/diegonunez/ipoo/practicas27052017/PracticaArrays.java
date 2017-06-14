package com.diegonunez.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticaArrays {
	
	private int[] arrayDeEnteros;
	private List<Integer> listaDeEnteros;
	
	
	public PracticaArrays(){
		arrayDeEnteros=new int[10];
		listaDeEnteros=new ArrayList<Integer>();
		
	}
	
	private void test(){
		int valor=0;
		
		for(int indice=0; indice<arrayDeEnteros.length; indice++){
			valor++;
			arrayDeEnteros[indice]=valor;
			System.out.println("Asignado: "+ valor + " a posicion: " + indice);
					arrayDeEnteros[indice]=valor;
			
			
		}
	
		for(int indice=0; indice<arrayDeEnteros.length; indice++){
			System.out.println("arrayDeEnteros["+ indice +");}"	
					+ arrayDeEnteros[indice]);
		}
	}
	public void testList(){
		int valor=0;
		int valorMaximo=10;
		for(int indice=0; indice<valorMaximo; indice++){
			valor++;
			listaDeEnteros.add(valor);
			
		}
	    for(Integer i: listaDeEnteros){
	    	System.out.println(i);
	    }
	
	    listaDeEnteros.remove(5);
	    Integer elemento=listaDeEnteros.get(2);
	    listaDeEnteros.remove(elemento);
	    System.out.println("***********");
	    
	    for(Integer i: listaDeEnteros){
	    	System.out.println(i);
	    }
	    
	    
	    
	}
	
	
	public static void main(String[] args){
		PracticaArrays pa=new PracticaArrays();
		pa.test();
		
	}

}
