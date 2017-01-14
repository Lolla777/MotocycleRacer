package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.HistoryEntity;
import motoProject2017.Repository.HistoryRepository;
import motoProject2017.Service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Service
@Transactional
public class HistiryImpl implements HistoryService{

    @Autowired
    private HistoryRepository History;

    @Override
    public List<HistoryEntity> findAll() {
        return History.findAll();
    }

    @Override
    public HistoryEntity findById(Long id) {
        return History.findOne(id);
    }
}
