package com.restservice.RestServiceTask.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "message_entity")
public class MessageEntity {

    @Id
    private Long id;

    @Column(name = "description_message")
    private String descriptionMessage;

    @Column(name = "name_message")
    private String nameMessage;


    @OneToOne
    @JoinColumn(name = "id_conversion")
    private StringConversionEntity idConversion;


}
