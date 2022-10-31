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
@RequestMapping("/acercaDe")
@CrossOrigin(origins = "https://frontend-2484a.web.app")
public class AcercaDeController {
    


    @Autowired
    private AcercaDeService acercadeServ;

    /**
     *
     * @return
     */
    @PreAuthorize("hasRole('USER')")
        @GetMapping("/acerca_de")
            public ResponseEntity<List<AcercaDe>> list(){
                List<AcercaDe> list = acercadeServ.verAcercaDe();
                return new ResponseEntity(list, HttpStatus.OK);
            }
    @PreAuthorize("hasRole('USER')")
        @GetMapping("/acerca_de/{id}")
            public ResponseEntity<AcercaDe> getById(@PathVariable("id") Long id){
                if(!acercadeServ.existsAcercaDe(id))
                    return new ResponseEntity(new Mensaje("No existe el Item buscado."), HttpStatus.NOT_FOUND);
                AcercaDe acercade = acercadeServ.buscarAcercaDe(id);
                return new ResponseEntity(acercade, HttpStatus.OK);
            }
    
    @PreAuthorize("hasRole('USER')")
        @PostMapping("/acerca_de")
        public ResponseEntity<?> create(@RequestBody AcercaDeDto acerc){
            AcercaDe acercaNuevo = new AcercaDe( acerc.getFullname(), acerc.getPosicion(), acerc.getDescripcion() );
            acercadeServ.crearAcercaDe(acercaNuevo);
            return new ResponseEntity(new Mensaje("acerca de creado"), HttpStatus.OK);
        }

    @PreAuthorize("hasRole('USER')")
        @DeleteMapping("/acerca_de/{id}")
        public ResponseEntity<?> delete(@PathVariable("id")Long id){
            if(!acercadeServ.existsAcercaDe(id))
                return new ResponseEntity(new Mensaje("No existe el Item buscado."), HttpStatus.NOT_FOUND);
            acercadeServ.borrarAcercaDe(id);
            return new ResponseEntity(new Mensaje("Item AcercaDe eliminado."), HttpStatus.OK);
        }

    /**
     *
     * @param id
     * @param acercDto
     * @return
     */
    @PreAuthorize("hasRole('USER')")
        @PutMapping("/acerca_de/{id}")
        public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody AcercaDeDto acercDto){
            if(!acercadeServ.existsAcercaDe(id))
                return new ResponseEntity(new Mensaje("No existe."), HttpStatus.NOT_FOUND);
            if(StringUtils.isBlank(acercDto.getFullname()))
                return new ResponseEntity(new Mensaje("Campo obligatorio"), HttpStatus.BAD_REQUEST);
            if(StringUtils.isBlank(acercDto.getPosicion()))
                return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
            if(StringUtils.isBlank(acercDto.getDescripcion()))
                return new ResponseEntity(new Mensaje("Campo obligatorio."), HttpStatus.BAD_REQUEST);
            

            AcercaDe acercEdit = acercadeServ.buscarAcercaDe(id);
            acercEdit.setFullname(acercDto.getFullname());
            acercEdit.setPosicion(acercDto.getPosicion());
            acercEdit.setDescripcion(acercDto.getDescripcion());
            acercadeServ.crearAcercaDe(acercEdit);
            return new ResponseEntity(new Mensaje("Actualizado."), HttpStatus.OK);
        }

    private static class AcercaDeService {

        public AcercaDeService() {
        }

        private boolean existsAcercaDe(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


        private AcercaDe buscarAcercaDe(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void crearAcercaDe(AcercaDe acercEdit) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void borrarAcercaDe(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private List<AcercaDe> verAcercaDe() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class AcercaDe {

        public AcercaDe() {
        }

        private AcercaDe(CharSequence fullname, CharSequence posicion, CharSequence descripcion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setFullname(CharSequence fullname) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setPosicion(CharSequence posicion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setDescripcion(CharSequence descripcion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Mensaje {

        public Mensaje(String no_existe_el_Item_buscado) {
        }
    }

    private static class AcercaDeDto {

        public AcercaDeDto() {
        }

        private CharSequence getFullname() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getPosicion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private CharSequence getDescripcion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

  

}
