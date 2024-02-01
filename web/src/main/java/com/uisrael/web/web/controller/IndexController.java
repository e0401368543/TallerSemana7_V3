package com.uisrael.web.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/index")
	public String indexPage(Model model) {
		model.addAttribute("Titulo", "Bienvenido pagina de Inicio");
		return "index";
	}

}
