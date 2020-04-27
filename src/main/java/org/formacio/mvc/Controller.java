package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private ServeiAlumnat servei;
	
	@RequestMapping(path="/alumnes")
	@ResponseBody
	public int reconta() {
		return servei.sizeAlumnes();
	}
	
}
