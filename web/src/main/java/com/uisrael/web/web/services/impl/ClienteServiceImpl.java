package com.uisrael.web.web.services.impl;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uisrael.web.web.service.IClienteService;
import com.uisrael.web.web.services.model.DTO.ClienteDTO;
import com.uisrael.web.web.utils.ConvertJson;


@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private RestTemplate gestionRest;

	@Override
	public void insertCliente(ClienteDTO nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClienteDTO> listCliente() {
		// TODO Auto-generated method stub
		
		List<String> clientes= Arrays.asList(gestionRest.getForObject("http://localhost:51742/api/clientes/listarString", String.class));
		
		ConvertJson<ClienteDTO> converter= new ConvertJson<>(ClienteDTO.class);
			
		List<ClienteDTO> clienteDTO= converter.convertJsonArray(clientes);
		return clienteDTO;
	}

	

	@Override
	public List<ClienteDTO> buscarXCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClienteDTO> buscarXMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCliente(ClienteDTO actual) {
		// TODO Auto-generated method stub
		
	}



}
