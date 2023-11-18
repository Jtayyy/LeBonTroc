package com.lebontroc.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Builder
@Getter
@Setter
public class UserDto {
    private String firstname;
    private String lastname;
    private String pseudo;
    private String password;
    private String email;
    private LocalDate birthdate;
    private String address;
    private boolean admin;
    //private List<Object> objects;
    public UserDto(String firstname, String lastname, String pseudo, String password, String email, LocalDate birthdate, String address, boolean admin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pseudo = pseudo;
        this.password = password;
        this.email = email;
        this.birthdate = birthdate;
        this.address = address;
        this.admin = admin;
    }
}
