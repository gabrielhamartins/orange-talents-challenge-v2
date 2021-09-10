package br.com.zup.orangetalentschallengev2.controller;

import br.com.zup.orangetalentschallengev2.dto.requests.UserDTO;
import br.com.zup.orangetalentschallengev2.entity.User;
import br.com.zup.orangetalentschallengev2.repository.UserRepository;
import br.com.zup.orangetalentschallengev2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userService = userService;
    }

    //http://localhost:8080/api/users
    @GetMapping("users")
    public ResponseEntity<List<User>> listUsers(){
        return ResponseEntity.ok(userService.listAll());
    }

    @GetMapping("users/{id}")
    public ResponseEntity<User> getUser(@PathVariable long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("user")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserDTO userDTO){

        return new ResponseEntity<>(userService.save(userDTO), HttpStatus.CREATED);
    }
}
