package com.diegonunez.ipoo.practicas27052017;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Asignaciones {
     
	//variables de tipo short, numeros enteros pequeños (hasta 32,767)
	private short _short;
	//variables de tipo int numeros enteros pequeños (hasta 2 a la 31-1)
	private int _int;
	//variable de tipo long de numeros pequeños (hasta 2 a la 63-1)
	private long _long;
	//variables de tipo float de numeros pequeños (hasta 2.000.000.000)
	private float _float;
	//variables de tipo float de numeros con decimales (mayores 2.000.000.000)
	private double _double;
	
	private boolean _boolean;
	private char _char;
	private String _string;
	private Date _date;
	
	public Asignaciones(){
		
	}
	
	public void test(){
		System.out.println("****Metodo test****");
		_short=1;
		_int=20;
		_long=50;	
		
		imp("_short", _short +"");
		imp("_int", _int + "");
		imp("_long", _long + "");
		
		
		_short=(short)(_short + 5);
		
		imp("_short", _short + "");
		
		_int= _int + 5;
		imp("_int", _int + "");
		
		_long=_long + 5;
		imp("_long", _long + "");
		
		_float=1.0f;
		_double=2.0d;
		
		imp("_float", _float + "");
		imp("_double", _double + "");
		
				
		_float=6.0f;		
		_double=7.0d;
		
		imp("_float", _float + "");
		imp("_double", _double + "");
		
		
		_char= 'A';
		imp("_char", _char + "");
		_string="AA";
		imp ("_string", _string + "");
		
		_char= 'B';
		imp("_char", _char + "");
		_string="BB";
		imp ("_string", _string + "");
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM//yyyy");
		imp("_date", _date + "");
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM//yyyy HH:mm:ss");
		imp("_date", _date + "");
		
		_date=new Date();
		imp("_date", _date + "");
		
		try {
			Thread.sleep(2000l);
		}catch(Exception e){
			e.printStackTrace();
					}
		_date=new Date();
		imp("_date", _date + "");
		
		try{
			_date=sdf.parse("20/05/2017");
		}catch(ParseException e) {
			e.printStackTrace();
		}
				
		imp("_date", sdf2.format(_date));
		
		int a=1;
		String s="Este es un literal de String";
		boolean b=true;
		float f=1.0f;
		double d=1.0d;
		char c='B';
		
				
		
		
		
	}
	private void imp(String variable, String valor){	
		System.out.println("Valor de " + variable + ": " + valor);
	}
		public static void main(String[] args){
		Asignaciones a=new Asignaciones();
		a.test();
			
		}
		

		
	}

