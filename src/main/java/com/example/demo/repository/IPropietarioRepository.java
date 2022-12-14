package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository{
	public void crear(Propietario pro);
	public void eliminar (Propietario pro);
	public Propietario buscar(String cedula);
	

}
