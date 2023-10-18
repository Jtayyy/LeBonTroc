package com.lebontroc.DTO;

import com.lebontroc.models.Object;
import com.lebontroc.models.User;
import java.io.IOException;
import java.util.List;

public class UserMapper {

    public static User fromDto(UserDto dto, Integer id, List<Object> objectListe) throws IOException{
        return new User.Builder()
                .id(id)
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .pseudo(dto.getPseudo())
                .email(dto.getEmail())
                .birthdate(dto.getBirthdate())
                .adresse(dto.getAdresse())
                .admin(dto.isAdmin())
                .objects(objectListe)
                .build();
    }

    public static UserDto toDto (User user){
        return UserDto.builder()
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .pseudo(user.getPseudo())
                .email(user.getEmail())
                .birthdate(user.getBirthdate())
                .adresse(user.getAdresse())
                .admin(user.isAdmin())
                //.objects(user.getObjects())
                .build();
    }
}
