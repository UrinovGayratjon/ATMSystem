package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.Summa;

@Repository
public interface SummaRepository extends JpaRepository<Summa, Integer> {
}
