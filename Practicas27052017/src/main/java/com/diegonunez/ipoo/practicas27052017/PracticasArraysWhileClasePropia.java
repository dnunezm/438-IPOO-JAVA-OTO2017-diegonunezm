package com.diegonunez.ipoo.practicas27052017;

import java.util.ArrayList;
import java.util.List;

public class PracticasArraysWhileClasePropia {

      private Persona[] arraysDePersona;
      private List<Persona> listaPersona;
      
      public PracticasArraysWhileClasePropia(){
    	  arraysDePersona=new Persona[15];
    	  listaPersona=new ArrayList<Persona>();
    	      	  
      }
      private void test(){
    	  int valor=0;
    	  int indice=0;
    	  
    	  while (indice < arraysDePersona.length){
    		  
    		  valor ++;
    		  
    		  System.out.println("Asignado:" + valor + "Posicion:" + indice);
    		  
    		  Persona p=null;
    		  if (indice==8){
    			  p=new Persona(5, "Ismael", "11111");
    		  }else{
    			  
    			  p=new Persona ( valor , "Persona" + valor, "99999" + valor);
    			  
    		  }
    		  
    		  arraysDePersona[indice]=p;
    		  
    		  indice++;
    		  		  
    	 
    	  }
    	 System.out.println("Indice:" + indice);
    	 indice=0;
    	 System.out.println("Indice (Desp):" + indice);
    	 
    	 Persona pBuscar=new Persona(5, "Diego", "21111");
    	 
    	 while (indice < arraysDePersona.length){
    		 Persona p1=arraysDePersona[indice];
    		 System.out.println("arraysDePersona["+ indice +"]:" + p1);
    		 
    		 if (p1.equals(pBuscar)){
    			 System.out.println("Buscado: " + pBuscar);
    			 System.out.println("Encontrado:" + p1);
    			
    		 }
    		 
    		 indice ++;
    		 
    	 }
    	 
    	 
    			  
    	  
      }
      public void testList(){
      int valor=0;
      
      int valormax=10;
      
      System.out.println("(Antes de asignar) Cuantos elementos tiene: " + listaPersona.size());
            
      int indice=0;
      
      while (indice < valormax){
    	  valor++;
    	  Persona p=new Persona(valor, "Persona" + valor ,"99999" + valor);
    	  System.out.println("Asignado:" + p);
    	  listaPersona.add(p);
    	  indice++;
    	  
      }
      
      
      
      }
      public static void main(String[]args){
  		PracticasArraysWhileClasePropia pa=new PracticasArraysWhileClasePropia();
  		
  		pa.test();  
      
      

      }
}
