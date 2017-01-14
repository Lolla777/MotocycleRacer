//package motoProject2017.Service.impl;
//
//import motoProject2017.EntityClasses.MotorcycleEntity;
//import motoProject2017.Repository.MotorcycleRepository;
//import motoProject2017.Service.MotoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
///**
// * Created by Ksenia on 14.01.2017.
// */
//@Service
//@Transactional
//public class MotoImpl implements MotoService{
//
//    @Autowired
//    private MotorcycleRepository Moto;
//
//    @Override
//    public List<MotorcycleEntity> findAll() {
//        return Moto.findAll();
//    }
//
//    @Override
//    public MotorcycleEntity findById(Long id) {
//        return Moto.findOne(id);
//    }
//}
