package kg.mega.FinalProject.models.dtos;

import kg.mega.FinalProject.models.entities.Channel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDto {
    Long id;
    String name;
    Boolean active;
}
