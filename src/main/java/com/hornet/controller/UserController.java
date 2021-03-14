package com.hornet.controller;

import com.hornet.common.response.ResponseCodes;
import com.hornet.forms.UserLoginForm;
import com.hornet.services.user.UserDto;
import com.hornet.services.user.UserService;
import com.hornet.utility.ResponseUtility;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public ResponseEntity<Optional<UserDto>> login(UserLoginForm userLoginForm) {
    return ResponseUtility.send(
      ResponseCodes.SUCCESS,
      userService.login(userLoginForm)
    );
  }
}
