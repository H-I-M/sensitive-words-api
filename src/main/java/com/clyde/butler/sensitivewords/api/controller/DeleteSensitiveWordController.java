package com.clyde.butler.sensitivewords.api.controller;

import com.clyde.butler.sensitivewords.api.service.SensitiveWordServiceGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteSensitiveWordController extends BaseController {
    private final SensitiveWordServiceGatewayImpl serviceGateway;

    @DeleteMapping(BASE_URL_ID)
    public void deleteWord(@PathVariable("id") Long id) {
        serviceGateway.deleteWord(id);
    }
}
