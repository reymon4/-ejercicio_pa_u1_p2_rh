package com.example.demo.service;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {
	public void crear(Propietario pro);
	public void eliminar(Propietario pro);
	public Propietario buscar(String cedula);
}
