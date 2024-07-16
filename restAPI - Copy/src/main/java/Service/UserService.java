package Service;

import Entity.User;
import com.example.restAPI.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();
    public UserDto getUserById(int id);
    public List<UserDto> searchListUser(String keyword);
}
