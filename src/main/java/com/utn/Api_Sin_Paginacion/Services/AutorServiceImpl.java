package com.utn.Api_Sin_Paginacion.Services;

import com.utn.Api_Sin_Paginacion.Entities.Autor;
import com.utn.Api_Sin_Paginacion.Repositories.AutorRepository;
import com.utn.Api_Sin_Paginacion.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
