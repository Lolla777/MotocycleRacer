package motoProject2017.Controller;

import motoProject2017.EntityClasses.MotorcycleEntity;
import motoProject2017.Service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@RestController
@RequestMapping("/moto")
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping("/all")
    public ResponseEntity<List<MotorcycleEntity>> getAll(){
        List<MotorcycleEntity> motorcycleEntities = motoService.findAll();
        return new ResponseEntity<List<MotorcycleEntity>>(motorcycleEntities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MotorcycleEntity> getById(@PathVariable Long id){
        MotorcycleEntity motorcycleEntity = motoService.findById(id);
        return  new ResponseEntity<MotorcycleEntity>(motorcycleEntity,HttpStatus.OK);
    }
}
