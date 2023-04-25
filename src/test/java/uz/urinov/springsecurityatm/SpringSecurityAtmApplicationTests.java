package uz.urinov.springsecurityatm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.urinov.springsecurityatm.entity.Card;
import uz.urinov.springsecurityatm.entity.Role;
import uz.urinov.springsecurityatm.entity.User;
import uz.urinov.springsecurityatm.entity.enums.RoleName;
import uz.urinov.springsecurityatm.repository.BankRepository;
import uz.urinov.springsecurityatm.repository.CardRepository;
import uz.urinov.springsecurityatm.repository.RoleRepository;
import uz.urinov.springsecurityatm.repository.UserRepository;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

@SpringBootTest
class SpringSecurityAtmApplicationTests {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    BankRepository bankRepository;
    @Autowired
    CardRepository cardRepository;
    Calendar calendar = Calendar.getInstance();

    @Test
    @DisplayName("Userni kartalari bilan birgalikda saqlash")
    public void saveCardWidthUser() {
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, 10);
        Optional<Role> roleByRole = roleRepository.findRoleByRole(RoleName.ROLE_DIRECTOR);
        Card card = new Card("0000999900009999", "123", "1234", bankRepository.getReferenceById(1), 100D);
        User user = new User("Jane", "Doe", Collections.singleton(roleByRole.get()));
        user.setCards(Collections.singleton(card));
        card.setUser(user);
        card.setExpireDate(calendar.getTime());
        Card save = cardRepository.save(card);
        System.out.println(save);
    }
}
