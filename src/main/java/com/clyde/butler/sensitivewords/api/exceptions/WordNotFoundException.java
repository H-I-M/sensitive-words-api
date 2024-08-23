package com.clyde.butler.sensitivewords.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Word not found")
public class WordNotFoundException extends RuntimeException  {
    public WordNotFoundException() {
    }
}
