package com.proyecto.backend.Repository;

import com.proyecto.backend.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    
}
