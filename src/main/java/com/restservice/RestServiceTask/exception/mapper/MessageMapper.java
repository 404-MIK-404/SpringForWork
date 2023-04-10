package com.restservice.RestServiceTask.exception.mapper;

import com.restservice.RestServiceTask.dto.MessageDTO;
import com.restservice.RestServiceTask.entity.MessageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    MessageDTO toDTO(MessageEntity stringConversionEntity);


}
