package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.Account;
import lombok.*;
import lombok.experimental.FieldDefaults;
//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BalanceDto {
    Long id;
    Double balance;
    Account account;

}
