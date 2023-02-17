package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.Order;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDateDto {
    Long id;
    Order order;
    LocalDate date;
}
