package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.ManufacturerEntity;
import motoProject2017.Repository.ManufacturerRepository;
import motoProject2017.Service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Service
@Transactional
public class ManufacturerImpl implements ManufacturerService{

    @Autowired
    private ManufacturerRepository Manuf;

    @Override
    public List<ManufacturerEntity> findAll() {
        return Manuf.findAll();
    }

    @Override
    public ManufacturerEntity findById(Long id) {
        return Manuf.findOne(id);
    }
}
