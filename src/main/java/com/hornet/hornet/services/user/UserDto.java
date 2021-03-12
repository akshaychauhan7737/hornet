package com.hornet.hornet.services.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;
import lombok.Data;

@Data
public class UserDto {

  private enum Gender {
    MALE,
    FEMALE,
  }

  private UUID id;
  private String name;
  private String email;
  private Gender gender;

  @JsonIgnore
  private String password;
}
