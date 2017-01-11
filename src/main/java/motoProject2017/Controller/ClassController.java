package motoProject2017.Controller;

import motoProject2017.EntityClasses.ClassEntity;
import motoProject2017.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ksenia on 11.01.2017.
 */
@RestController
@RequestMapping("/class")
public class ClassController {


    @Autowired
    private ClassService classService;

    @GetMapping("/{id}")
    public ResponseEntity<ClassEntity> getById (@PathVariable Long id){
        ClassEntity classEntity = classService.findById(id);
        return new ResponseEntity<ClassEntity>(classEntity, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClassEntity>> getAll (){
        List<ClassEntity> classEntity = classService.findAll();
        return new ResponseEntity<>(classEntity, HttpStatus.OK);
    }
}
