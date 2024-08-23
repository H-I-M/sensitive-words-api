package com.clyde.butler.sensitivewords.api.controller;

import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;
import com.clyde.butler.sensitivewords.api.service.SensitiveWordServiceGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sensitive-words")
public class UpdateSensitiveWordController extends BaseController {
    private final SensitiveWordServiceGatewayImpl serviceGateway;

    @PutMapping(BASE_URL_ID)
    public SensitiveWordDTO updateWord(@RequestBody SensitiveWordDTO wordDto) {
        return serviceGateway.updateWord(wordDto);
    }
}
