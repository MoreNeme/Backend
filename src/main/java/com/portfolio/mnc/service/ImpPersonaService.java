
package com.portfolio.mnc.service;

import com.portfolio.mnc.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mnc.repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaService {
    @Autowired IPersonaRepository ipersonarepository;
    
    public List<Persona> list(){
        return ipersonarepository.findAll();
    }
    
    public Optional<Persona>getOne(int id){
        return ipersonarepository.findById(id);
    }
    
    public Optional<Persona>getByNombre(String nombre){
        return ipersonarepository.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        ipersonarepository.save(persona);
    }
    
    public void delete(int id){
        ipersonarepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ipersonarepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return ipersonarepository.existsByNombre(nombre);
    }

    
}
