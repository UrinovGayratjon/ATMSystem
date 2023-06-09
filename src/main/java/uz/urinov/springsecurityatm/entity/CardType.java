package uz.urinov.springsecurityatm.entity;

import lombok.*;
import org.hibernate.Hibernate;
import uz.urinov.springsecurityatm.entity.enums.CardName;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "card_type")
public class CardType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CardName type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CardType cardType = (CardType) o;
        return id != null && Objects.equals(id, cardType.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
