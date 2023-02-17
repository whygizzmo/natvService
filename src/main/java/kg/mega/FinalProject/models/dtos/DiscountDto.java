package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.Channel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDto {
    Long id;
    LocalDateTime startDate;
    LocalDateTime endDate;
    Double bannerPrice;
    Double advertisementPrice;

    int fromDaysCount;
    Channel channel;

}
