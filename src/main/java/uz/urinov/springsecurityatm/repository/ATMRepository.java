package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.ATM;

@Repository
public interface ATMRepository extends JpaRepository<ATM, Long> {
}