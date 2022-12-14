package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository veRepo; 
	@Override
	public void crear(Vehiculo ve) {
		// TODO Auto-generated method stub
		this.veRepo.crear(ve);
//		
	}
//
//	@Override
//	public void eliminar(Vehiculo ve) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.veRepo.buscar(placa);
	}

}
