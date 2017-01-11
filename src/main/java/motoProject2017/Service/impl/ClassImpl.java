package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.ClassEntity;
import motoProject2017.Repository.ClassRepository;
import motoProject2017.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ksenia on 11.01.2017.
 */
@Service
@Transactional
public class ClassImpl implements ClassService {

    @Autowired
    private ClassRepository Class;

    @Override
    public List<ClassEntity> findAll() {
        return Class.findAll();
    }

    @Override
    public ClassEntity findById(Long id) {
        return Class.findOne(id);
    }
}
