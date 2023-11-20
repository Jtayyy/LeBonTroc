package com.lebontroc.DTO;

import com.lebontroc.models.Object;
import com.lebontroc.models.Post;
import com.lebontroc.models.User;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.List;

public class UserMapper {

    public static User fromDto(UserDto dto, Integer id, List<Object> objectListe, List<Post> favoritePosts) throws IOException{
        return new User.Builder()
                .id(id)
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .pseudo(dto.getPseudo())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .birthdate(dto.getBirthdate())
                .address(dto.getAddress())
                .admin(dto.isAdmin())
                .objects(objectListe)
                .favorites(favoritePosts)
                .build();
    }

    public static UserDto toDto (User user){
        return UserDto.builder()
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .pseudo(user.getPseudo())
                .password(user.getPassword())
                .email(user.getEmail())
                .birthdate(user.getBirthdate())
                .address(user.getAddress())
                .admin(user.isAdmin())
                .build();
    }
}
