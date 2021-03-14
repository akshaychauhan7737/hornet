package com.hornet.utility;

import com.hornet.common.response.ResponseCodes;
import com.hornet.common.response.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface ResponseUtility {
  static <T> ResponseEntity<T> send(ResponseCodes responseCodes, T t) {
    ResponseDto<T> r = new ResponseDto<T>();
    r.setMessage(responseCodes.getMessage());
    r.setStatus(responseCodes.getStatus());
    r.setData(t);
    return new ResponseEntity(r, responseCodes.getHttpStatus());
  }
}
