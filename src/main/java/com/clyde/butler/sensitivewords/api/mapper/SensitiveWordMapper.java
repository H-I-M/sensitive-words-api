package com.clyde.butler.sensitivewords.api.mapper;

import com.clyde.butler.sensitivewords.api.entities.SensitiveWord;
import com.clyde.butler.sensitivewords.api.model.SensitiveWordDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SensitiveWordMapper {
    SensitiveWordMapper INSTANCE = Mappers.getMapper(SensitiveWordMapper.class);
    SensitiveWordDTO toDTO(SensitiveWord entity);
    SensitiveWord toEntity(SensitiveWordDTO dto);
}
