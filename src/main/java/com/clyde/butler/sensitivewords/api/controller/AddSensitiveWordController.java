package com.clyde.butler.sensitivewords.api.controller;

import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;
import com.clyde.butler.sensitivewords.api.service.SensitiveWordServiceGatewayImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AddSensitiveWordController extends BaseController {
    private final SensitiveWordServiceGatewayImpl serviceGateway;

    @PostMapping(BASE_URL)
    public SensitiveWordDTO addSensitiveWord(@RequestBody String newWord) {
        return serviceGateway.addWord(newWord);
    }
}
