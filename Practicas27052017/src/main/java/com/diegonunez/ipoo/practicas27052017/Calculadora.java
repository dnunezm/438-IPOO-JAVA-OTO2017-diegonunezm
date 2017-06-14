package com.diegonunez.ipoo.practicas27052017;

public class Calculadora {
	public int sumar(int sumando1, int sumando2){
		int suma=0;
		suma=sumando1+sumando2;
		return suma;
					
		
	}
	
    public int restar(int minuendo, int sustraendo){
    	int resta=0;
    	resta=minuendo-sustraendo;
    	return resta;

}

    public int multiplicar(int multiplicando, int multiplicador){
	     int producto=0;
	     producto=multiplicando*multiplicador;
	     return producto;
}
    public int dividir(int dividendo, int divisor){
    	int cociente=0;
    	cociente=dividendo/divisor;
    	return cociente;
    	
	
}
    public static void main(String[] args){
    	Calculadora c=new Calculadora();
    	int a=4;
    	int b=2;
    	System.out.println("Suma; " + c.sumar(a, b));
    	System.out.println("Resta; " + c.restar(a, b));
    	System.out.println("Multiplicar; " + c.multiplicar(a, b));
        System.out.println("Dividir; " + c.dividir(a, b));

}
}
