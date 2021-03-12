package com.hornet.hornet.services.user;

import com.hornet.hornet.forms.UserLoginForm;
import java.util.Optional;

public interface UserService {
  public Optional<UserDto> login(UserLoginForm userLoginForm);
}
