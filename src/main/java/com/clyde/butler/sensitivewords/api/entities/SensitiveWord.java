package com.clyde.butler.sensitivewords.api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "sensitive_words")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensitiveWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(length = 50)
    @NotBlank
    @NotNull
    private String word;
}
