package com.hornet.common.response;

import org.springframework.http.HttpStatus;

public enum ResponseCodes {
  SUCCESS(true, HttpStatus.OK, "success"),
  INTERNAL_SERVER_ERROR(
    false,
    HttpStatus.INTERNAL_SERVER_ERROR,
    "Something Went Wrong"
  ),
  BAD_REQUEST(false, HttpStatus.BAD_REQUEST, "Invalid Request"),
  UNAUTHORIZED(false, HttpStatus.UNAUTHORIZED, "Unauthorised Request");

  private final boolean status;

  private final HttpStatus httpStatus;

  private final String respMessage;

  ResponseCodes(boolean status, HttpStatus httpStatus, String respMessages) {
    this.status = status;
    this.httpStatus = httpStatus;
    this.respMessage = respMessages;
  }

  public boolean getStatus() {
    return this.status;
  }

  public HttpStatus getHttpStatus() {
    return this.httpStatus;
  }

  public String getMessage() {
    return this.respMessage;
  }
}
