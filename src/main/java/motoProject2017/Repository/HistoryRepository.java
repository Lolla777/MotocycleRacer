package motoProject2017.Repository;

import motoProject2017.EntityClasses.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ksenia on 14.01.2017.
 */
public interface HistoryRepository extends JpaRepository<HistoryEntity,Long> {
    HistoryEntity findOne(Long id);
}
