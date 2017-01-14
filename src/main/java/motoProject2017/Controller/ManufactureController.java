package motoProject2017.Controller;

import motoProject2017.EntityClasses.ManufacturerEntity;
import motoProject2017.EntityClasses.MaterialEntity;
import motoProject2017.Service.ManufacturerService;
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
@RequestMapping("/manufacture")
public class ManufactureController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public ResponseEntity<List<ManufacturerEntity>> getAll(){
        List<ManufacturerEntity> manufacturerEntities = manufacturerService.findAll();
        return new ResponseEntity<List<ManufacturerEntity>>(manufacturerEntities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ManufacturerEntity> getById(@PathVariable Long id){
        ManufacturerEntity manufacturerEntity = manufacturerService.findById(id);
        return new ResponseEntity<ManufacturerEntity>(manufacturerEntity,HttpStatus.OK);
    }
}
