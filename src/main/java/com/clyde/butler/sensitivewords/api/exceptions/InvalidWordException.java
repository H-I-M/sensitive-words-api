package com.clyde.butler.sensitivewords.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ALREADY_REPORTED, reason = "Invalid word")
public class InvalidWordException extends RuntimeException {
    public InvalidWordException() {
    }
}
