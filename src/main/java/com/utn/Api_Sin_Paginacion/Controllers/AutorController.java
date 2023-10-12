package com.utn.Api_Sin_Paginacion.Controllers;

import com.utn.Api_Sin_Paginacion.Entities.Autor;
import com.utn.Api_Sin_Paginacion.Services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
