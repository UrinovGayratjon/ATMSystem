package uz.urinov.springsecurityatm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.springsecurityatm.entity.CardType;
import uz.urinov.springsecurityatm.entity.enums.CardName;

import java.util.Optional;

@Repository
public interface CardTypeRepository extends JpaRepository<CardType, Integer> {
    Optional<CardType> findCardTypeByType(CardName type);
}
