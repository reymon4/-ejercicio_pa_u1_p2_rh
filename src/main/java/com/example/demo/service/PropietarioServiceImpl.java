package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired 
	private IPropietarioRepository proRepo;
	@Override
	public void crear(Propietario pro) {
		// TODO Auto-generated method stub
		this.proRepo.crear(pro);
	}

	@Override
	public void eliminar(Propietario pro) {
		// TODO Auto-generated method stub
	this.proRepo.eliminar(pro);	
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.proRepo.buscar(cedula);
	}

}
