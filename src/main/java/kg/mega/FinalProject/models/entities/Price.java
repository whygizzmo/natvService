package kg.mega.FinalProject.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//
@Entity
@Table(name = "tb_prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double bannerPrice;
    Double advertisementPrice;
    LocalDateTime startDate = LocalDateTime.now();
    LocalDateTime endDate = startDate.plusYears(100);
    @ManyToOne
    Channel channel;

}
