package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.TypeEntity;
import motoProject2017.Repository.TypeRepository;
import motoProject2017.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ksenia on 11.01.2017.
 */
@Service
@Transactional
public class TypeImpl implements TypeService {

    @Autowired
    private TypeRepository Type;

    @Override
    public List<TypeEntity> findAll() {
        return Type.findAll();
    }

    @Override
    public TypeEntity findById(Long id) {
        return Type.findOne(id);
    }
}
