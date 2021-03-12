package com.hornet.services.user;

import com.hornet.forms.UserLoginForm;
import java.util.Optional;

public interface UserService {
  public Optional<UserDto> login(UserLoginForm userLoginForm);
}
