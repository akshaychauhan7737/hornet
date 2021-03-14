package com.hornet.services.user.impl;

import com.hornet.forms.UserLoginForm;
import com.hornet.services.user.UserDto;
import com.hornet.services.user.UserService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public Optional<UserDto> login(UserLoginForm userLoginForm) {
    return null;
  }
}
