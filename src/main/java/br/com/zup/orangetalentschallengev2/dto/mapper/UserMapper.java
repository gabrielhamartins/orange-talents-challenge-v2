package br.com.zup.orangetalentschallengev2.dto.mapper;

import br.com.zup.orangetalentschallengev2.dto.requests.UserDTO;
import br.com.zup.orangetalentschallengev2.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toModel(UserDTO userDTO);
    UserDTO toDTO(User user);
}
