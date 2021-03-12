package com.hornet.utility;

import com.hornet.common.response.ResponseEnvelop;
import org.springframework.http.ResponseEntity;

public interface ResponseUtility {
  static <ResponseStatusDto extends ResponseEnvelop, T> ResponseEntity<T> send(
    ResponseStatusDto t
  ) {
    return new ResponseEntity(t.getBody(), t.getStatus());
  }
}
