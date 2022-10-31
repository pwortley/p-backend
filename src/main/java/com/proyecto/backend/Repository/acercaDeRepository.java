package com.proyecto.backend.Repository;

import com.proyecto.backend.Entity.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface acercaDeRepository extends JpaRepository <AcercaDe, Long> {
       

}