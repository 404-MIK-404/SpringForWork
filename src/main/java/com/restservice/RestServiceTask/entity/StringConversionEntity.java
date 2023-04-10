package com.restservice.RestServiceTask.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "string_conversion")
public class StringConversionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date_save")
    private Date dateSave;

    @Column(name = "original_string")
    private String originalString;

    @Column(name = "converted_string")
    private String convertedString;

    @OneToOne(mappedBy = "idConversion")
    private MessageEntity messageEntity;


}
