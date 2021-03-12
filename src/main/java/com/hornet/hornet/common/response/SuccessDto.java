package com.hornet.hornet.common.response;

import org.springframework.http.HttpStatus;

public class SuccessDto<T> implements ResponseEnvelop<T> {

  private T body;

  public SuccessDto(T body) {
    this.body = body;
  }

  @Override
  public HttpStatus getStatus() {
    return HttpStatus.OK;
  }

  @Override
  public T getBody() {
    return this.body;
  }
}
