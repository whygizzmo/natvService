package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.Account;
import kg.mega.FinalProject.models.entities.Channel;
import lombok.*;
import lombok.experimental.FieldDefaults;
//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BannerDto {
    Long id;
    Channel channel;
    Account account;
    String image;
}
