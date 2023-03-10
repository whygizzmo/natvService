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
@Table(name = "tb_advertisements")//
public class Advertesement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String advertisementText;
    @ManyToOne
    Channel channel;
    @ManyToOne
    Account account;
}
