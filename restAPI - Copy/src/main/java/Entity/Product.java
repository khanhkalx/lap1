package Entity;

import com.example.restAPI.model.dto.UserDto;
import com.example.restAPI.model.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {
    private int id;
    private String Name;
    private Double price;
    private String diachi;
    private UserDto people;

}
