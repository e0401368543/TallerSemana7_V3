package com.uisrael.web.web.services.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteDTO {
	
	private int idCleinte;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String cedula;
	private String mail;

}
