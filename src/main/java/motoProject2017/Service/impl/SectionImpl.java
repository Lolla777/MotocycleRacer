package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.SectionEntity;
import motoProject2017.Repository.SectionRepository;
import motoProject2017.Service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Service
@Transactional
public class SectionImpl implements SectionService{

    @Autowired
    private SectionRepository Section;

    @Override
    public List<SectionEntity> findAll() {
        return Section.findAll();
    }
}
