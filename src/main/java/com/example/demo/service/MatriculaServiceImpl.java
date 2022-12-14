package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;

@Service 
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IPropietarioService proService;
	@Autowired
	private IVehiculoService veService;
	@Autowired
	private IMatriculaRepository matriPro;
	@Override
	public void generarMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		//ORIGEN
		BigDecimal des = new BigDecimal(0); //Aquí guardaremos el valor de la matrícula
		BigDecimal descuento = new BigDecimal(0); //Aquí almacenaremos el valor de la matrícula con el descuento
		Propietario pro = this.proService.buscar(cedula);
		Vehiculo ve = this.veService.buscar(placa);
		Matricula ma = new Matricula();
		ma.setFechaMatricula(LocalDateTime.now());
		ma.setPro(pro);
		ma.setVe(ve);
		matriPro.equals(ma);
		if (ve.getTipo()=="P") {
			 ma.setValorMatricula(ve.getPrecio().multiply(new BigDecimal (0.15)));
			 des = ma.getValorMatricula();
		}else {
			ma.setValorMatricula(ve.getPrecio().multiply(new BigDecimal (0.10)));
			des = ma.getValorMatricula();
		}
		if(ma.getValorMatricula().compareTo(new BigDecimal(2000))==1) {
			//ma.setValorMatricula(des.multiply(new BigDecimal (0.07)));
			descuento = des.multiply(new BigDecimal(0.07));
			ma.setValorMatricula(des.add(descuento));
			
		}
		
		
				
				
				
				
				
				
		
//	
	
}
}
