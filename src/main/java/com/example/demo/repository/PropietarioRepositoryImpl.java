package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private static List<Propietario> baseDatos = new ArrayList<>();
	@Override
	public void crear(Propietario pro) {
		// TODO Auto-generated method stub
		
		baseDatos.add(pro);
	}

	@Override
	public void eliminar(Propietario pro) {
		// TODO Auto-generated method stub
		baseDatos.remove(pro);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario pro=null;
		for (Propietario p: baseDatos) {
			if(pro.getCedula().equals(cedula)) {
				pro=p;
			}
		}
		return pro;
	}
	 
	
	

}
