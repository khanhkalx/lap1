package Service;

import Entity.User;
import com.example.restAPI.Exception.NotFoundException;
import com.example.restAPI.model.dto.UserDto;
import com.example.restAPI.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserServiceImpl implements UserService{

    private static ArrayList<User> list = new ArrayList<User>() ;

    static {
        list.add(new User(1,"khanh","khanhkalx@gmail.com","05812412421","dakdj.pnj","1235"));
        list.add(new User(2,"khanh2","khanhkalx@gmail.com","05812412421","dakdj.pnj","1235"));
        list.add(new User(3,"khanh3","khanhkalx@gmail.com","05812412421","dakdj.pnj","1235"));
        list.add(new User(4,"khanh4","khanhkalx@gmail.com","05812412421","dakdj.pnj","1235"));

    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> arr = new ArrayList<UserDto>();
        for (User user: list){
            arr.add(UserMapper.userDto(user));
        }
        return arr;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user: list){
            if(user.getId()==id){
                return UserMapper.userDto(user);
            }
        }
        throw new NotFoundException("User không tồn tại");
    }

    @Override
    public List<UserDto> searchListUser(String keyword) {
        List<UserDto> arr = new ArrayList<UserDto>();
        for (User user: list){
            if(user.getName().contains(keyword)){
                arr.add(UserMapper.userDto(user));
            }

        }
        return arr;
    }
}
