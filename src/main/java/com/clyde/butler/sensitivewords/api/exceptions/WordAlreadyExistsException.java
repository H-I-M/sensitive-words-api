package com.clyde.butler.sensitivewords.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ALREADY_REPORTED, reason = "Word already exists")
public class WordAlreadyExistsException extends RuntimeException  {
    public WordAlreadyExistsException() {
    }
}
