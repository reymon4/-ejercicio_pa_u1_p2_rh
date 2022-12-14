package com.example.demo.service;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	public void crear(Vehiculo ve);
	//public void eliminar (Vehiculo ve);
	public Vehiculo buscar(String placa);

}
