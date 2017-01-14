package motoProject2017.Service;

import motoProject2017.EntityClasses.MaterialEntity;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface MaterialService {
    List<MaterialEntity> findAll();
    MaterialEntity findById(Long id);
}
