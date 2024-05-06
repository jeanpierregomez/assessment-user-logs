package co.com.bancolombia.model.log;
import lombok.*;
//import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class Log {
    private String id;
    private String timestamp;
    private String log;

    @Override
    public String toString() {
        return id + " " + timestamp + " " + log;
    }

}
