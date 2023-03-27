package com.restservice.RestServiceTask.mapper;

import com.restservice.RestServiceTask.dto.StringConversionDTO;
import com.restservice.RestServiceTask.entity.StringConversionEntity;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")
public interface StringConversionMapper {

    StringConversionDTO toDTO(StringConversionEntity stringConversionEntity);

}
