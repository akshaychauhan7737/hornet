package com.hornet.hornet.services.user;

import com.hornet.hornet.forms.UserLoginForm;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDao implements UserService {

  @Override
  public Optional<UserDto> login(UserLoginForm userLoginForm) {
    return null;
  }
}
