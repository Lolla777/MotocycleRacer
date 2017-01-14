package motoProject2017.Service;

import motoProject2017.EntityClasses.HistoryEntity;

import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface HistoryService {
    List<HistoryEntity> findAll();
    HistoryEntity findById(Long id);
}
