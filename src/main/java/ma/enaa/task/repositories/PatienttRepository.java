package ma.enaa.task.repositories;

import ma.enaa.task.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatienttRepository extends JpaRepository<Product , Long> {
}
