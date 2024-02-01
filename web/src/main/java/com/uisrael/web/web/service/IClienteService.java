package com.uisrael.web.web.service;

import java.util.List;

import com.uisrael.web.web.services.model.DTO.ClienteDTO;



public interface IClienteService {
	public void insertCliente(ClienteDTO nuevo);

	public List<ClienteDTO> listCliente();
	

	
	public List<ClienteDTO> buscarXCedula(String cedula);
	
	public List<ClienteDTO> buscarXMail(String mail);
	
	public void updateCliente(ClienteDTO actual); 

}
