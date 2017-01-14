package motoProject2017.Controller;

import motoProject2017.EntityClasses.CongratulationsEntity;
import motoProject2017.Service.CongratulationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@RestController
@RequestMapping("/congratulation")
public class CongratulationController {

    @Autowired
    private CongratulationsService congratulationsService;

    @GetMapping("/all")
    public ResponseEntity<List<CongratulationsEntity>> getAll (){
        List<CongratulationsEntity> congratulationsEntities = congratulationsService.findAll();
        return new ResponseEntity<>(congratulationsEntities, HttpStatus.OK);
    }
}
