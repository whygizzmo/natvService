package kg.mega.FinalProject.models.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
//
@Entity
@Table(name = "tb_balances")
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double balance;
    @OneToOne
    Account account;
}
