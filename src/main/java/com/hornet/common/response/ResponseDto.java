package com.hornet.common.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@Data
public class ResponseDto<T> {

  private String message = "Something Went Wrong";
  private boolean status = false;
  private T data = null;
}
