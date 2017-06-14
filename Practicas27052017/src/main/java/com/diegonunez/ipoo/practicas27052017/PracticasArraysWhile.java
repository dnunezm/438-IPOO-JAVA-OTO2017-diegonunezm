package com.diegonunez.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticasArraysWhile {
             
	private int[] arraysDeEnteros;
	private List<Integer> listaEnteros;
	
	public PracticasArraysWhile(){
		
		arraysDeEnteros=new int[15];
		listaEnteros=new ArrayList<Integer>();
		
	}
	
	private void test(){
		
		int valor=0;
		
		int indice=0;
		
		while (indice<arraysDeEnteros.length){
	
		valor++;
		
		System.out.println("Asignado:" + valor + "a posicion" + indice);
		
		arraysDeEnteros[indice]= valor;
		
		indice++;
		}
		
		System.out.println("Indice:" + indice);
		
		indice=0;
		
		System.out.println("Indice (Desp: " + indice);
		
		while (indice < arraysDeEnteros.length){
			System.out.println("arraysDeEnteros[" + indice + "]: "
					
			                   + arraysDeEnteros[indice]);
			indice++;
			
			
		}
	}
	
	public void testList(){
		
		int valor=0;
		
		int valormax=15;
		
		System.out.println("(Antes de asignar) Cuantos elementos tiene:" + listaEnteros.size());
		
		int indice=0;
		while (indice < valormax){
			indice++;
			System.out.println("Asignado:" + valor);
			listaEnteros.add(valor);
			indice++;
			
		}
		listaEnteros.remove(0);
		
		Integer elemento=listaEnteros.get(2);
		
		listaEnteros.remove(elemento);
		
		System.out.println("**********");
		
		for (Integer i: listaEnteros){
		 System.out.println(i);
		}
		
		System.out.println("(Despues de quitar) Cuantos elementos tiene: " + listaEnteros.size());
		
		listaEnteros.clear();
		
		System.out.println("(Cuantos elementos tiene:" + listaEnteros.size());
		
		}
	
		
	public static void main(String[]args){
		PracticasArraysWhile pa=new PracticasArraysWhile();
		
		pa.test();
		
	}
}
