package com.clyde.butler.sensitivewords.api.service;

import com.clyde.butler.sensitivewords.api.entities.SensitiveWord;
import com.clyde.butler.sensitivewords.api.exceptions.InvalidWordException;
import com.clyde.butler.sensitivewords.api.exceptions.WordAlreadyExistsException;
import com.clyde.butler.sensitivewords.api.exceptions.WordNotFoundException;
import com.clyde.butler.sensitivewords.api.mapper.SensitiveWordMapper;
import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;
import com.clyde.butler.sensitivewords.api.repository.SensitiveWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SensitiveWordServiceGatewayImpl implements SensitiveWordServiceGateway {
    private final SensitiveWordRepository repository;
    private final SensitiveWordMapper mapper;

    @Override
    public String sanitizeWordString(String dirtyWord) {
        if (dirtyWord.isEmpty() || dirtyWord.isBlank()) {
            throw new InvalidWordException();
        }

        List<SensitiveWord> words = repository.findAll();
        for (SensitiveWord word : words) {
            dirtyWord = dirtyWord.replaceAll("(?i)" + word.getWord(), "******");
        }

        return dirtyWord;
    }

    @Override
    public List<SensitiveWordDTO> getAllSensitiveWords() {
        return repository.findAll().stream()
                .map(SensitiveWordMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SensitiveWordDTO addWord(@NonNull String word) throws RuntimeException {
        if (repository.existsByWord(word)) {
            throw new WordAlreadyExistsException();

        }

        return mapper.toDTO(repository.save(
                mapper.toEntity(SensitiveWordDTO.builder().word(word).build())));
    }

    @Override
    public SensitiveWordDTO updateWord(SensitiveWordDTO word) {
        SensitiveWord existingWord = repository.findById(word.getId())
                .orElseThrow(WordNotFoundException::new);
        existingWord.setWord(word.getWord());

        return mapper.toDTO(repository.save(existingWord));
    }

    @Override
    public void deleteWord(Long id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new WordNotFoundException();
        }
    }
}
