package be.vdab.repository;

import be.vdab.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by jeansmits on 06/07/15.
 */

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{


}
