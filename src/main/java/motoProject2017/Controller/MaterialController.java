package motoProject2017.Controller;

import motoProject2017.EntityClasses.MaterialEntity;
import motoProject2017.Service.MaterialService;
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
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/all")
    public ResponseEntity<List<MaterialEntity>> getAll(){
        List<MaterialEntity> materialEntities = materialService.findAll();
        return new ResponseEntity<List<MaterialEntity>>(materialEntities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaterialEntity> getById(@PathVariable Long id){
        MaterialEntity materialEntity = materialService.findById(id);
        return new ResponseEntity<MaterialEntity>(materialEntity,HttpStatus.OK);
    }
}
