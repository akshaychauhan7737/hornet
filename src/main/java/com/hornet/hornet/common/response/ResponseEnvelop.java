package com.hornet.hornet.common.response;

import org.springframework.http.HttpStatus;

public interface ResponseEnvelop<T> {
  public HttpStatus getStatus();

  public T getBody();
}
