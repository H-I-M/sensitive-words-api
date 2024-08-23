package com.clyde.butler.sensitivewords.api.service;

import com.clyde.butler.sensitivewords.api.exceptions.InvalidWordException;
import com.clyde.butler.sensitivewords.api.exceptions.WordAlreadyExistsException;
import com.clyde.butler.sensitivewords.api.exceptions.WordNotFoundException;
import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;

import java.util.List;

public interface SensitiveWordServiceGateway {
    String sanitizeWordString(String dirtyWord) throws InvalidWordException;
    List<SensitiveWordDTO> getAllSensitiveWords();
    SensitiveWordDTO addWord(String word) throws WordAlreadyExistsException;
    SensitiveWordDTO updateWord(SensitiveWordDTO word) throws WordNotFoundException;
    void deleteWord(Long id) throws WordNotFoundException;
}
