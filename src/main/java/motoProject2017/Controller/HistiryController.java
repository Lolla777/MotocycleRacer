package motoProject2017.Controller;

import motoProject2017.EntityClasses.HistoryEntity;
import motoProject2017.Service.HistoryService;
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
@RequestMapping("/history")
public class HistiryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/all")
    public ResponseEntity<List<HistoryEntity>> getAll(){
        List<HistoryEntity>historyEntities = historyService.findAll();
        return new ResponseEntity<List<HistoryEntity>>(historyEntities, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<HistoryEntity> getById(@PathVariable Long id){
        HistoryEntity historyEntity = historyService.findById(id);
        return new ResponseEntity<HistoryEntity>(historyEntity,HttpStatus.OK);
    }
}
