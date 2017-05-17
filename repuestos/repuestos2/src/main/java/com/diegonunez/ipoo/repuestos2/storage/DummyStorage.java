package com.diegonunez.ipoo.repuestos2.storage;

import java.util.ArrayList;
import java.util.List;

import com.diegonunez.ipoo.repuestos2.datos.cliente.Cliente;

public class DummyStorage implements Storage{

	//lista de clientes falsos
	private List<Cliente> clientes;
	
	public DummyStorage(){
		//variable para simular un autonumerico de base de datos
	int id=0;
			
	//inicializo mi vector
	clientes=new ArrayList<>();
	
	Cliente c=new Cliente();
	c.setId(++id);
	c.setNombre("Diego Nunez");
	c.setNroDoc("999999");
	c.setTipoDoc("CI");
	c.setPassword("123");
	
	clientes.add(c);
	
	
	
	}

	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {

        for(Cliente c: clientes){
        	//si el tipo de clieente es igual
        	//al tipo de documento recibido
        	//y el nro de documento es igual al recibido
        	if (
        		c.getTipoDoc().equals(tipoDoc) &&
        		c.getNroDoc().equals(nroDoc) &&
        		c.getPassword().equals(password)
        		)
        		//Entonces retorno ese cliente
        		{return c;
        		
        		}
        }
	//si no encontro retorno nulo
        return null;
	}
    public static void main(String[] args){
	 Storage s=new DummyStorage();
	 Cliente c=s.obtCliente("CI", "nropassword", "999999");
}
}
