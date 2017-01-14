package motoProject2017.Repository;

import motoProject2017.EntityClasses.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ksenia on 11.01.2017.
 */
public interface TypeRepository extends JpaRepository<TypeEntity,Long> {
    TypeEntity findOne(Long id);
}
