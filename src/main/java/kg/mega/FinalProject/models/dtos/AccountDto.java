package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDto {
    Long id;
    String login;
    String password;
    User user;

}
