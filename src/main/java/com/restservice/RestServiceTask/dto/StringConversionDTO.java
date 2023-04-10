package com.restservice.RestServiceTask.dto;

import com.restservice.RestServiceTask.entity.MessageEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StringConversionDTO {

    private Long id;

    private Date dateSave;

    private String originalString;

    private String convertedString;

    private MessageDTO messageEntity;

}
