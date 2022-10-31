package com.proyecto.backend.Controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping(path = "image")
@CrossOrigin(origins = "https://frontend-2484a.web.app")
public class EducacionController {

    @Autowired
    private EducacionService eduServ;

    /**
     *
     * @return
     */
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/educacion")
    @SuppressWarnings("NonPublicExported")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> list = eduServ.verEducacion();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    /**
     *
     * @param id
     * @return
     */
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/educacion/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") Long id) {
        if (!eduServ.existsEducacion(id)) {
            return new ResponseEntity(new Mensaje("No existe."), HttpStatus.NOT_FOUND);
        }
        Educacion educ = eduServ.buscarEducacion(id);
        return new ResponseEntity(educ, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/educacion")
    public ResponseEntity<?> create(@RequestBody EducacionDto edu) {
        Educacion eduNuevo = new Educacion(edu.getInstitucion(), edu.getTitulo(), edu.getPeriodo(), edu.getEstado(), edu.getDetalles());
        eduServ.crearEducacion(eduNuevo);
        return new ResponseEntity(new Mensaje("Creado correctamente."), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('USER')")
    @DeleteMapping("/educacion/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!eduServ.existsEducacion(id)) {
            return new ResponseEntity(new Mensaje("No existe."), HttpStatus.NOT_FOUND);
        }
        eduServ.borrarEducacion(id);
        return new ResponseEntity(new Mensaje("Eliminado correctamente."), HttpStatus.OK);
    }

    /**
     *
     * @param id
     * @param eduDto
     * @return
     */
    @PreAuthorize("hasRole('USER')")
    @PutMapping("/educacion/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody EducacionDto eduDto) {
        if (!eduServ.existsEducacion(id)) {
            return new ResponseEntity(new Mensaje("No existe."), HttpStatus.NOT_FOUND);
        }
        if (StringUtils.isBlank(eduDto.getInstitucion())) {
            return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(eduDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(eduDto.getPeriodo())) {
            return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(eduDto.getEstado())) {
            return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(eduDto.getDetalles())) {
            return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
        }

        Educacion eduEdit = eduServ.buscarEducacion(id);
        eduEdit.setInstitucion(eduDto.getInstitucion());
        eduEdit.setTitulo(eduDto.getTitulo());
        eduEdit.setPeriodo(eduDto.getPeriodo());
        eduEdit.setEstado(eduDto.getEstado());
        eduEdit.setDetalles(eduDto.getDetalles());
        eduServ.crearEducacion(eduEdit);
        return new ResponseEntity(new Mensaje("Información actualizada."), HttpStatus.OK);
    }

    private static class EducacionService {

        public EducacionService() {
        }

        private void crearEducacion(Educacion eduEdit) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Educacion buscarEducacion(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean existsEducacion(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void borrarEducacion(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private List<Educacion> verEducacion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Mensaje {

        public Mensaje(String item_Educacion_actualizado) {
        }
    }

    private static class Educacion {

        public Educacion() {
        }

        private Educacion(CharSequence institucion, CharSequence titulo, CharSequence periodo, CharSequence estado, CharSequence detalles) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setInstitucion(CharSequence institucion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setTitulo(CharSequence titulo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setPeriodo(CharSequence periodo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setEstado(CharSequence estado) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setDetalles(CharSequence detalles) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class EducacionDto {

        public EducacionDto() {
        }

        private CharSequence getDetalles() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getEstado() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getPeriodo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getTitulo() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getInstitucion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
