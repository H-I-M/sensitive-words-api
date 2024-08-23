package com.clyde.butler.sensitivewords.api.controller;

import com.clyde.butler.sensitivewords.api.service.SensitiveWordServiceGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SanitizeWordController extends BaseController {
    private final SensitiveWordServiceGateway serviceGateway;

    @PostMapping(BASE_URL + "/sanitize/{dirtyWord}")
    public String sanitizeString(@PathVariable("dirtyWord") String dirtyWord) {
        return serviceGateway.sanitizeWordString(dirtyWord);
    }
}
