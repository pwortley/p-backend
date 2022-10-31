package com.proyecto.backend.Repository;

import com.proyecto.backend.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
   public Optional<Educacion> findByNombre(String nombreE);
   public boolean existsByNombreE(String nombreE);
}
