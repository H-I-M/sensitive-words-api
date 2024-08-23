package com.clyde.butler.sensitivewords.api.controller;

import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;
import com.clyde.butler.sensitivewords.api.service.SensitiveWordServiceGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetSensitiveWordsController extends BaseController {
    private final SensitiveWordServiceGatewayImpl serviceGateway;

    @GetMapping(BASE_URL)
    public List<SensitiveWordDTO> getAllSensitiveWords() {
        return serviceGateway.getAllSensitiveWords();
    }
}
