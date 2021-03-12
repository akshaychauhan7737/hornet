package com.hornet.controller;

import com.hornet.common.response.SuccessDto;
import com.hornet.forms.UserLoginForm;
import com.hornet.services.user.UserDto;
import com.hornet.services.user.UserService;
import com.hornet.utility.ResponseUtility;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  @PostMapping
  public ResponseEntity<UserDto> login(UserLoginForm userLoginForm) {
    return ResponseUtility.send(
      new SuccessDto(userService.login(userLoginForm))
    );
  }
}
    return ResponseUtility.send(
      new SuccessDto(userService.login(userLoginForm))
    );
  }
}
