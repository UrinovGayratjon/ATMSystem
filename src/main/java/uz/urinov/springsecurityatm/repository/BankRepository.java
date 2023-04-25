package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
    boolean existsByName(String name);
}
