package com.lebontroc.DTO;

import com.lebontroc.models.Object;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
public class UserDto {
    private String firstname;
    private String lastname;
    private String pseudo;
    private String email;
    private LocalDate birthdate;
    private String adresse;
    private boolean admin;
    //private List<Object> objects;
    public UserDto(String firstname, String lastname, String pseudo, String email, LocalDate birthdate, String adresse, boolean admin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pseudo = pseudo;
        this.email = email;
        this.birthdate = birthdate;
        this.adresse = adresse;
        this.admin = admin;
    }
}
