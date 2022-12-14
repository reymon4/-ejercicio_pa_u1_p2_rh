package com.example.demo.repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	public void crear(Vehiculo ve);
	//public void eliminar (Vehiculo ve);
	public Vehiculo buscar(String placa);

}
