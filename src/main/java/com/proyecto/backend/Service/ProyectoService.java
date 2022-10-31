package com.proyecto.backend.Service;

import com.proyecto.backend.Entity.Proyecto;
import com.proyecto.backend.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class ProyectoService {

    @Autowired
    public ProyectoRepository proyectoRepo;

    
    public List<Proyecto> verProyectos(){
      return proyectoRepo.findAll();
    }

    
    public void crearProyecto (Proyecto pro){
      proyectoRepo.save(pro);
    }
   
   
    public void borrarProyecto (Long id){
      proyectoRepo.deleteById(id);
    } 
 
   
    public Proyecto buscarProyecto (Long id){
      return proyectoRepo.findById(id).orElse(null);
    }

  
    public void editarProyecto (Long id, Proyecto pro){
         proyectoRepo.findById(id).map( editExpe -> {
         editExpe.setTitulo(pro.getTitulo());
         editExpe.setImagen(pro.getImagen());
         editExpe.setDescripcion(pro.getDescripcion());

         return proyectoRepo.save(editExpe);
      });
        //.orElseGet(() -> {
        //  acercade.setId(id);
        //  return acercadeRepo.save(acercade);
        //});
    }
    
            public Boolean existsProyecto(Long id){
                try {
                  proyectoRepo.findById(id);
                  return true;
                 } catch(Exception e){
                    return false;
                 }
            }

        
          

}
