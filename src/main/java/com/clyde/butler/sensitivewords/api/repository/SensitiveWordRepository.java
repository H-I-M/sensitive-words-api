package com.clyde.butler.sensitivewords.api.repository;

import com.clyde.butler.sensitivewords.api.entities.SensitiveWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensitiveWordRepository extends JpaRepository<SensitiveWord, Long> {
    boolean existsByWord(String word);
}
