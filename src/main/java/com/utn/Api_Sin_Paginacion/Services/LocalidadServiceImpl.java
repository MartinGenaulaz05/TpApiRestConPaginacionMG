package com.utn.Api_Sin_Paginacion.Services;

import com.utn.Api_Sin_Paginacion.Entities.Localidad;
import com.utn.Api_Sin_Paginacion.Repositories.BaseRepository;
import com.utn.Api_Sin_Paginacion.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }

}
