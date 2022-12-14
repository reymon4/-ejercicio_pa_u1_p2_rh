package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	private static List<Vehiculo> baseDatos = new ArrayList<>();
	@Override
	public void crear(Vehiculo ve) {
		// TODO Auto-generated method stub
		baseDatos.add(ve);
	}

//	@Override
//	public void eliminar(Vehiculo ve) {
//		// TODO Auto-generated method stub
//		vehiculo.remove(ve);
//	}

	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo ve=null;
		for (Vehiculo v: baseDatos) {
			if(ve.getPlaca().equals(placa)) {
				ve=v;
			}
		}
		return ve;
	}
}
