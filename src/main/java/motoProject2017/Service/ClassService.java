package motoProject2017.Service;

import motoProject2017.EntityClasses.ClassEntity;

import java.util.List;

/**
 * Created by Ksenia on 11 .01.2017.
 */
public interface ClassService {
    List<ClassEntity> findAll();
    ClassEntity findById(Long id);
}
