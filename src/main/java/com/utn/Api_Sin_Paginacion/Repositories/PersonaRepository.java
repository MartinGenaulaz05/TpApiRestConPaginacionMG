package com.utn.Api_Sin_Paginacion.Repositories;

import com.utn.Api_Sin_Paginacion.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

    //Metodo Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre,String apellido);
    boolean existsByDni(int dni);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //JPQL parametros indexados
    //@Query(value = "select p from Persona p where p.nombre like '%?1%' or p.apellido like '%?1%' ")
    //List<Persona> search(String filtro);

    //JPQL con parametros nombrados
    //@Query(value = "select p from Persona p where p.nombre like '%:filtro%' or p.apellido like '%:filtro%' ")
    //List<Persona> search2(@Param("filtro") String filtro);

    //@Query(value = "select p from Persona p where p.nombre like '%:filtro%' or p.apellido like '%:filtro%' ")
    //Page<Persona> search2(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true)
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true)
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
}
