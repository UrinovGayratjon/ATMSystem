package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.Bank;
import uz.urinov.springsecurityatm.entity.BankOwner;

import java.util.UUID;

@Repository
public interface BankOwnerRepository extends JpaRepository<BankOwner, UUID> {
    boolean existsByBankAndEmail(Bank bank, String email);

    boolean existsByEmail(String email);
}
