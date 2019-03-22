package com.dawes.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.model.ActuacionVO;
import com.dawes.service.ActuacionService;
import com.dawes.service.EmpleadoService;
import com.dawes.service.TipoActuacionService;

@Controller
public class PrinicpalController {
	
	@Autowired
	EmpleadoService es;
	
	@Autowired
	ActuacionService as;
	
	@Autowired
	TipoActuacionService tas;

	// Considero que el index es el formulario de busqueda
	@RequestMapping("/")
	public String index(Model modelo) {
		
		modelo.addAttribute("empleados", es.findAll());
		return "/index";
	}
	
	// Una vez buscamos los elementos entre fechas entramos aqui
	@RequestMapping("/buscar")
	public String buscar(@RequestParam int empleado, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaInicial,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaFinal, Model modelo) {
		
		
		// Compruebo si las fechas enviadas no estan vacias, si lo estan les vuelvo a dirigir al indice
		if (fechaInicial == null || fechaFinal == null) {
			return "redirect:/";
		}
		
		double total = 0;
		
		List<Object[]> resultado = as.listado(fechaInicial, fechaFinal, empleado);
		
		// Calculo el importe total
		for (int i = 0; i < resultado.size(); i++) {
			total = (double) resultado.get(i)[1] + total;
		}

		modelo.addAttribute("total", total);
		modelo.addAttribute("resultados", resultado);
		modelo.addAttribute("empleado", es.findById(empleado).get());
		return "/listado";
	}
	
	// Redirección al solicitar modificar un elemento, recojo como parametros el id del empleado y el id de la actuacion
	@RequestMapping("/formModificar")
	public String formModificar(@RequestParam int idEmpleado, @RequestParam int idActuacion, Model modelo) {
		
		modelo.addAttribute("actuaciones", tas.findAll());
		modelo.addAttribute("empleado", es.findById(idEmpleado).get());
		modelo.addAttribute("idActuacion", idActuacion);
		return "/modificar";
	}
	
	// Método encargado de resolver la actualización 
	@RequestMapping("/modificar")
	public String modificar(Model modelo, @RequestParam float km, @RequestParam int actuacion,
			@RequestParam int idActuacion) {
		
		Optional<ActuacionVO> act = as.findById(idActuacion);
		
		act.get().setKm(km);
		act.get().setTipoActuacion(tas.findById(actuacion).get());
		as.save(act.get());		
		
		// Redirige al índice una vez se haya acabado
		return "redirect:/";
	}
	
}
