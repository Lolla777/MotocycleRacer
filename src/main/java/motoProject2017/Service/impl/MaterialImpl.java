package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.MaterialEntity;
import motoProject2017.Repository.MaterialRepository;
import motoProject2017.Service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Service
@Transactional
public class MaterialImpl implements MaterialService {

    @Autowired
    private MaterialRepository Material;

    @Override
    public List<MaterialEntity> findAll() {
        return Material.findAll();
    }

    @Override
    public MaterialEntity findById(Long id) {
        return Material.findOne(id);
    }
}
