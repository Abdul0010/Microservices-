package come.abduk.blacklist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BlackListChecker {

    @Id
    @SequenceGenerator(name = "blacklist_id_sequence",
            sequenceName = "blacklist_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "blacklist_id_sequence")
    private Integer id;
    private Boolean isBlacklisted;
    private Integer userId;
    private LocalDateTime createdAt;
}
