package Controller;


import Entity.User;
import Service.UserService;
import com.example.restAPI.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword") String name){
        List<UserDto> list = userService.searchListUser(name);
        return ResponseEntity.ok(list);
    }

    @GetMapping("")
    public ResponseEntity<?> getlistUser(){
        List<UserDto> list = userService.getListUser();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserbyId(@PathVariable int id){
        UserDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        return null;
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }

}
