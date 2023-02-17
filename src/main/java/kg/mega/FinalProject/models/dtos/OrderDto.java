package kg.mega.FinalProject.models.dtos;
//
import kg.mega.FinalProject.models.entities.Advertesement;
import kg.mega.FinalProject.models.entities.Banner;
import kg.mega.FinalProject.models.enums.PaymentStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {
    Long id;
    Advertesement advertesement;
    Banner banner;
    PaymentStatus status;
}
