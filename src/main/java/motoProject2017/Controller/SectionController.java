package motoProject2017.Controller;

import motoProject2017.EntityClasses.SectionEntity;
import motoProject2017.Service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@RestController
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/all")
    public ResponseEntity<List<SectionEntity>> getAll(){
        List<SectionEntity> sectionEntities = sectionService.findAll();
        return new ResponseEntity<List<SectionEntity>>(sectionEntities, HttpStatus.OK);
    }
}
