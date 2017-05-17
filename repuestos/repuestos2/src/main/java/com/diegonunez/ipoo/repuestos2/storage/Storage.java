package com.diegonunez.ipoo.repuestos2.storage;

import com.diegonunez.ipoo.repuestos2.datos.cliente.Cliente;

//Interface en vez de Clase
public interface Storage {

	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
