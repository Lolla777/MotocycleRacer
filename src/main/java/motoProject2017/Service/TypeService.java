package motoProject2017.Service;

import motoProject2017.EntityClasses.TypeEntity;

import java.util.List;

/**
 * Created by Ksenia on 11.01.2017.
 */
public interface TypeService {
    List<TypeEntity> findAll();
    TypeEntity finfById(Long id);
}
