package com.uisrael.web.web.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.uisrael.web.web.service.IClienteService;
import com.uisrael.web.web.services.model.DTO.ClienteDTO;



//@RestController
@Controller
public class ClienteController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IClienteService clienteServices;
	
	//@GetMapping("/ms/listarcliente")
	//public List<ClienteDTO> listarCliente(Model model) {
	//	List<ClienteDTO> resultado= clienteServices.listCliente();
	//	model.addAttribute("lista",resultado);
	//	return resultado;
	//	
	//}
	//
	
	@GetMapping("/ms/listarcliente")
	public String listarCliente(Model model) {
		List<ClienteDTO> resultado= clienteServices.listCliente();
		model.addAttribute("lista",resultado);
		return "cliente";
		
	}
	
	@GetMapping("/ms/listarclienteDTO")
	public String listarClienteDTO(Model model) {
		List<ClienteDTO> resultado= clienteServices.listCliente();
		//ClienteDTO c2=gson.fromJson(jsonString, Customer.class);
		model.addAttribute("listaCliente",resultado);
		return "/cliente/listaCliente";
		
	}
	
	
	

}
