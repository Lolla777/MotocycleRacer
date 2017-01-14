package motoProject2017.Controller;

import motoProject2017.EntityClasses.TypeEntity;
import motoProject2017.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/all")
    public ResponseEntity<List<TypeEntity>> getAll(){
        List<TypeEntity> typeEntity = typeService.findAll();
        return new ResponseEntity<>(typeEntity,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeEntity> getById(@PathVariable Long id){
        TypeEntity typeEntity = typeService.finfById(id);
        return new ResponseEntity<TypeEntity>(typeEntity,HttpStatus.OK);
    }
}
