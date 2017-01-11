package motoProject2017.Repository;

        import motoProject2017.EntityClasses.ClassEntity;
        import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ksenia on 11.01.2017.
 */
public interface ClassRepository extends JpaRepository<ClassEntity,Long>{
    ClassEntity findOne(Long id);
}
