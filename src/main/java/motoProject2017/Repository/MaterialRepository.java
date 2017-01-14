package motoProject2017.Repository;

import motoProject2017.EntityClasses.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface MaterialRepository extends JpaRepository<MaterialEntity,Long> {
    MaterialEntity findOne(Long id);
}
