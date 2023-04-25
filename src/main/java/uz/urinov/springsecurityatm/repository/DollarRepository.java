package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.Dollar;

@Repository
public interface DollarRepository extends JpaRepository<Dollar, Long> {
}
