package com.proyecto.backend.Repository;

import com.proyecto.backend.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
  
}