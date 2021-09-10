package br.com.zup.orangetalentschallengev2.service;

import br.com.zup.orangetalentschallengev2.dto.mapper.UserMapper;
import br.com.zup.orangetalentschallengev2.dto.requests.UserDTO;
import br.com.zup.orangetalentschallengev2.entity.User;
import br.com.zup.orangetalentschallengev2.exception.BadRequestException;
import br.com.zup.orangetalentschallengev2.repository.UserRepository;
import br.com.zup.orangetalentschallengev2.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final DateUtil dateUtil;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, DateUtil dateUtil, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.dateUtil = dateUtil;
        this.userRepository = userRepository;
    }

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){

        return userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException( "User ID not found."));
    }

    @Transactional
    public User save(UserDTO userDTO) {
        User userToSave = userMapper.toModel(userDTO);
        return userRepository.save(userToSave);
    }
}
