package motoProject2017.Repository;

import motoProject2017.EntityClasses.ManufacturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity,Long>{
    ManufacturerEntity findOne(Long id);
}
