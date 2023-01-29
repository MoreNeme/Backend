/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mnc.repository;

import com.portfolio.mnc.entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author maria
 */
public interface RHys extends JpaRepository<Hys, Integer> {
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
