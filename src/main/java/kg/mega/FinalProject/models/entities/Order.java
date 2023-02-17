package kg.mega.FinalProject.models.entities;

import kg.mega.FinalProject.models.enums.PaymentStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity//
@Table(name = "tb_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Advertesement advertesement;
    @ManyToOne
    Banner banner;
    @Enumerated(EnumType.ORDINAL)
    PaymentStatus status = PaymentStatus.IN_PROGRESS;
}
