package motoProject2017.Service.impl;

import motoProject2017.EntityClasses.CongratulationsEntity;
import motoProject2017.Repository.CongratulationsRepository;
import motoProject2017.Service.CongratulationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Ksenia on 14.01.2017.
 */
@Service
@Transactional
public class CongratulationsImpl implements CongratulationsService {

    @Autowired
    private CongratulationsRepository Congratulation;

    @Override
    public List<CongratulationsEntity> findAll() {
        return Congratulation.findAll();
    }
}
