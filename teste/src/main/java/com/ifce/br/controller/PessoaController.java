package com.ifce.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {
	@GetMapping("/olaMundo")
	public String olaMundo()
{
		return "ola-mundo";
	}

}
