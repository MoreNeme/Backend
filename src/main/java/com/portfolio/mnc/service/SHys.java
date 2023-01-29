/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mnc.service;

import com.portfolio.mnc.entity.Hys;
import com.portfolio.mnc.repository.RHys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
@Transactional
public class SHys {
    @Autowired
    RHys rHys;
    
    public List<Hys> list(){
        return rHys.findAll();
    }
    
    public Optional<Hys> getOne(int id){
        return rHys.findById(id);
    }
    
    public Optional<Hys> getByNombre(String nombre){
        return rHys.findByNombre(nombre);
    }
    public void save(Hys skill){
        rHys.save(skill);
    }
    
    public void delete(int id){
        rHys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rHys.existsByNombre(nombre);
    }
}
