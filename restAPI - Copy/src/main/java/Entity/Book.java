package Entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
}
