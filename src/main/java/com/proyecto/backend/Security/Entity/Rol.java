package com.proyecto.backend.Security.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author HP
 */
@Entity
@SuppressWarnings({"ValidAttributes", "PersistenceUnitPresent"})
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

    @SuppressWarnings("NonPublicExported")
    public Rol(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol(com.proyecto.backend.Security.Enums.RolNombre rolNombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @SuppressWarnings("NonPublicExported")
    public RolNombre getRolNombre() {
        return rolNombre;
    }

    @SuppressWarnings("NonPublicExported")
    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    private static class RolNombre {

        public RolNombre() {
        }

        String name() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
