package com.restservice.RestServiceTask.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageDTO {

    private Long id;

    private String descriptionMessage;

    private String nameMessage;

}
