package motoProject2017.Service;

import motoProject2017.EntityClasses.ManufacturerEntity;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface ManufacturerService {
    List<ManufacturerEntity> findAll();
    ManufacturerEntity findById(Long id);
}
