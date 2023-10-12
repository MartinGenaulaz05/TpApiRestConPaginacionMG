package com.utn.Api_Sin_Paginacion.Controllers;

import com.utn.Api_Sin_Paginacion.Entities.Localidad;
import com.utn.Api_Sin_Paginacion.Services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
